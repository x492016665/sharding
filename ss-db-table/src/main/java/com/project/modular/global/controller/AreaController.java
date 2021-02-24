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
import com.project.modular.global.entity.Area;
import com.project.modular.global.service.IAreaService;

/**
 * <p>
 * 地区表（单库单表） 前端控制器
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/area")
public class AreaController {

    @Autowired
    private IAreaService areaService;

    @PostMapping("/save")
    public ResponseData<?> save() {
        List<Area> list = new ArrayList<Area>();
        list.add(new Area("110000", "北京市"));
        list.add(new Area("110101", "东城区"));
        list.add(new Area("110102", "西城区"));
        list.add(new Area("110106", "丰台区"));
        areaService.saveBatch(list);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/list")
    public ResponseData<?> list() {
        List<Area> aList = areaService.list();
        return ResponseData.out(CodeEnum.SUCCESS, aList);
    }

    @GetMapping("/update")
    public ResponseData<?> update(Long id) {
        Area area = new Area("1180000", "天津市");
        area.setId(id);
        areaService.updateById(area);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/delete")
    public ResponseData<?> delete(Long id) {
        areaService.removeById(id);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }
}
