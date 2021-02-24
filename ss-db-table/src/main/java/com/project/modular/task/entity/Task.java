package com.project.modular.task.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 任务表（水平拆分表）
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Task extends Model<Task> {

    private static final long serialVersionUID = 1L;

    /**
     * 任务id
     */
    @TableId(value = "task_id", type = IdType.NONE)
    private Long taskId;

    /**
     * 任务名称
     */
    private String taskName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    @Override
    protected Serializable pkVal() {
        return this.taskId;
    }

    public Task(String taskName) {
        this.taskName = taskName;
    }
}
