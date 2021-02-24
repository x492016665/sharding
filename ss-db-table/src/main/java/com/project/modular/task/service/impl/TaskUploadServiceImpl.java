package com.project.modular.task.service.impl;

import com.project.modular.task.entity.TaskUpload;
import com.project.modular.task.mapper.TaskUploadMapper;
import com.project.modular.task.service.ITaskUploadService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 任务上传表（绑定表子表） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class TaskUploadServiceImpl extends ServiceImpl<TaskUploadMapper, TaskUpload> implements ITaskUploadService {

}
