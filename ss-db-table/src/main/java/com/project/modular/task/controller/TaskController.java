package com.project.modular.task.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.commom.response.CodeEnum;
import com.project.commom.response.ResponseData;
import com.project.modular.task.entity.Task;
import com.project.modular.task.service.ITaskService;

/**
 * <p>
 * 任务表（水平拆分表） 前端控制器
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private ITaskService taskService;

    @PostMapping("/save")
    public ResponseData<?> save() {
        List<Task> list = new ArrayList<Task>();
        list.add(new Task("任务1"));
        list.add(new Task("任务2"));
        list.add(new Task("任务3"));
        list.add(new Task("任务4"));
        taskService.saveBatch(list);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/list")
    public ResponseData<?> list() {
        List<Task> aList = taskService.list();
        return ResponseData.out(CodeEnum.SUCCESS, aList);
    }

    @GetMapping("/update")
    public ResponseData<?> update() {
        Task task = new Task("天津市");
        task.setTaskId(11111l);
        taskService.updateById(task);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/delete")
    public ResponseData<?> delete() {
        Long id = 1253130139206709249l;
        taskService.removeById(id);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }
}
