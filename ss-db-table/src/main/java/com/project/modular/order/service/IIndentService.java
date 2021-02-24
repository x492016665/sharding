package com.project.modular.order.service;

import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.project.modular.order.entity.Indent;

/**
 * <p>
 * 订单表（绑定表父表） 服务类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
public interface IIndentService extends IService<Indent> {

    List<Map<String, Object>> listByIndentId(Long indentId);

    List<Map<String, Object>> listByCustomerId(Long customerId);

    List<Map<String, Object>> listByName(String customerName);
}
