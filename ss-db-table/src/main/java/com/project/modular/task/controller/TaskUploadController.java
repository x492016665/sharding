package com.project.modular.task.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.commom.response.CodeEnum;
import com.project.commom.response.ResponseData;
import com.project.modular.task.entity.CodeRelate;
import com.project.modular.task.entity.TaskUpload;
import com.project.modular.task.service.ICodeRelateService;
import com.project.modular.task.service.ITaskUploadService;

import cn.hutool.core.lang.UUID;

/**
 * <p>
 * 任务上传表（绑定表子表） 前端控制器
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/taskUpload")
public class TaskUploadController {

    @Autowired
    private ITaskUploadService taskUploadService;

    @Autowired
    private ICodeRelateService codeRelateService;

    /**
     * 模拟场景，生产回传信息，包含一个任务id和多个瓶箱垛码关联信息
     * 
     * @date 2020年4月23日
     * @author huangjg127075
     */
    @GetMapping("/save")
    public ResponseData<?> save(Long taskId) {
        // 生产回传信息
        TaskUpload taskUpload = new TaskUpload();
        taskUpload.setFactoryId(1253146102136365057l);
        taskUpload.setTaskId(taskId);
        String stackCode = UUID.randomUUID().toString();
        taskUpload.setStackCode(stackCode);
        taskUploadService.save(taskUpload);
        // 瓶箱垛关联信息
        ArrayList<CodeRelate> list = new ArrayList<CodeRelate>(15);
        CodeRelate codeRelate = null;
        for (int i = 0; i < 15; i++) {
            codeRelate = new CodeRelate();
            codeRelate.setTaskId(taskId);
            codeRelate.setStackCode(stackCode);
            codeRelate.setBoxCode("box" + i);
            codeRelate.setBottleCode("bottle" + i);
            list.add(codeRelate);
        }
        codeRelateService.saveBatch(list);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }
}
