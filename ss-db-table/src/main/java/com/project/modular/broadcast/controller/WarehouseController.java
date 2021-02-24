package com.project.modular.broadcast.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.commom.response.CodeEnum;
import com.project.commom.response.ResponseData;
import com.project.modular.broadcast.entity.Warehouse;
import com.project.modular.broadcast.service.IWarehouseService;

/**
 * <p>
 * 仓库表（广播表） 前端控制器
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    private IWarehouseService warehouseService;

    @PostMapping("/save")
    public ResponseData<?> save() {
        List<Warehouse> list = new ArrayList<Warehouse>();
        list.add(new Warehouse("湖南仓"));
        list.add(new Warehouse("北京仓"));
        list.add(new Warehouse("深圳仓"));
        list.add(new Warehouse("广西仓"));
        warehouseService.saveBatch(list);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/list")
    public ResponseData<?> list() {
        List<Warehouse> aList = warehouseService.list();
        return ResponseData.out(CodeEnum.SUCCESS, aList);
    }

    @GetMapping("/update")
    public ResponseData<?> update(Long id) {
        Warehouse area = new Warehouse("天津市");
        area.setWarehouseId(id);
        warehouseService.updateById(area);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/delete")
    public ResponseData<?> delete(Long id) {
        warehouseService.removeById(id);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }
}
