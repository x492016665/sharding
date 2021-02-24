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
import com.project.modular.broadcast.entity.Factory;
import com.project.modular.broadcast.service.IFactoryService;

/**
 * <p>
 * 工厂表（广播表） 前端控制器
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/factory")
public class FactoryController {

    @Autowired
    private IFactoryService factoryService;

    @PostMapping("/save")
    public ResponseData<?> save() {
        List<Factory> list = new ArrayList<Factory>();
        list.add(new Factory("富土康"));
        list.add(new Factory("血汗工厂"));
        list.add(new Factory("深圳厂"));
        list.add(new Factory("南宁厂"));
        factoryService.saveBatch(list);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/list")
    public ResponseData<?> list() {
        List<Factory> aList = factoryService.list();
        return ResponseData.out(CodeEnum.SUCCESS, aList);
    }

    @GetMapping("/update")
    public ResponseData<?> update(Long id) {
        Factory area = new Factory("天津市");
        area.setFactoryId(id);
        factoryService.updateById(area);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/delete")
    public ResponseData<?> delete(Long id) {
        factoryService.removeById(id);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }
}
