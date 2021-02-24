package com.project.modular.global.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.commom.response.CodeEnum;
import com.project.commom.response.ResponseData;
import com.project.modular.global.entity.Config;
import com.project.modular.global.service.IConfigService;

/**
 * <p>
 * 配置表（单库单表,UUID主键） 前端控制器
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/config")
public class ConfigController {

    @Autowired
    private IConfigService configService;

    @PostMapping("/save")
    public ResponseData<?> save() {
        List<Config> list = new ArrayList<Config>();
        list.add(new Config("开始"));
        list.add(new Config("结束"));
        list.add(new Config("停止"));
        list.add(new Config("关闭"));
        list.add(new Config("静止"));
        configService.saveBatch(list);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/list")
    public ResponseData<?> list() {
        List<Config> aList = configService.list();
        return ResponseData.out(CodeEnum.SUCCESS, aList);
    }

    @GetMapping("/update")
    public ResponseData<?> update(String code) {
        Config area = new Config("天津市");
        area.setCode(code);
        configService.updateById(area);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }
}
