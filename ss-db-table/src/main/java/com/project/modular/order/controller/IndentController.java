package com.project.modular.order.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.commom.response.CodeEnum;
import com.project.commom.response.ResponseData;
import com.project.modular.order.entity.Indent;
import com.project.modular.order.entity.IndentDetail;
import com.project.modular.order.service.IIndentDetailService;
import com.project.modular.order.service.IIndentService;

/**
 * <p>
 * 订单表（绑定表父表） 前端控制器
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/indent")
public class IndentController {

    @Autowired
    private IIndentService indentService;

    @Autowired
    private IIndentDetailService indentDetailService;

    /**
     * 模拟场景，一个用户下了一个订单，订单从一个仓库出货，这个订单包含了很多的产品
     * 
     * @date 2020年4月23日
     * @author huangjg127075
     */
    @GetMapping("/save")
    public ResponseData<?> save(Long customerId) {
        // 订单
        Indent indent = new Indent();
        indent.setCustomerId(customerId);
        indent.setIndentName("京东订单3");
        indent.setWarehouseId(1253150084208562177l);
        indentService.save(indent);
        // 订单详情
        ArrayList<IndentDetail> list = new ArrayList<IndentDetail>();
        IndentDetail indentDetail = null;
        for (int i = 0; i < 10; i++) {
            indentDetail = new IndentDetail();
            indentDetail.setCustomerId(customerId); // 分库字段
            indentDetail.setIndentId(indent.getIndentId());
            indentDetail.setProductName("商品" + i);
            indentDetail.setNum(100 + i);
            list.add(indentDetail);
        }
        indentDetailService.saveBatch(list);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    /**
     * 模拟场景，查询某个订单信息、所属仓库和订单详情 正常来说，需要整合成树形信息，懒得整理了
     * 结果，由于命中了分表键，没命中分库键，所以会在每个库的特定表下查询
     * 
     * @date 2020年4月23日
     * @author huangjg127075
     */
    @GetMapping("/listByIndentId")
    public ResponseData<?> listByIndentId(Long indentId) {
        List<Map<String, Object>> list = indentService.listByIndentId(indentId);
        return ResponseData.out(CodeEnum.SUCCESS, list);
    }

    /**
     * 模拟场景，查询某个用户拥有的订单和订单详情（非树形结构）。 结果，由于命中了分库键，没命中分表键，所以只在一个库中进行关联查询，indent0
     * detail0、indent0 detail1,indent1 detail0,indent1 detail1
     * 
     * @date 2020年4月23日
     * @author huangjg127075
     */
    @GetMapping("/listByCustomerId")
    public ResponseData<?> listByCustomerId(Long customerId) {
        List<Map<String, Object>> list = indentService.listByCustomerId(customerId);
        return ResponseData.out(CodeEnum.SUCCESS, list);
    }

    /**
     * 模拟场景，根据用户名去查询订单和订单详情（非树形）
     * 结果描述，命中了customerName分表键，所以在每个库进行查询，确定了customer表，indent和indent_detail表进行组合
     * 
     * @date 2020年4月23日
     * @author huangjg127075
     */
    @GetMapping("/listByName")
    public ResponseData<?> listByName(String customerName) {
        List<Map<String, Object>> list = indentService.listByName(customerName);
        return ResponseData.out(CodeEnum.SUCCESS, list);
    }
}
