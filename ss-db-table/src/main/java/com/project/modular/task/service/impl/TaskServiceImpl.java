package com.project.modular.task.service.impl;

import com.project.modular.task.entity.Task;
import com.project.modular.task.mapper.TaskMapper;
import com.project.modular.task.service.ITaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务表（水平拆分表） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements ITaskService {

}
