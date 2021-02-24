package com.project.modular.task.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 任务上传表（绑定表子表）
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TaskUpload extends Model<TaskUpload> {

    private static final long serialVersionUID = 1L;

    /**
     * 上传id
     */
    @TableId(value = "upload_id", type = IdType.NONE)
    private Long uploadId;

    /**
     * 工厂id,跟factory的主键关联
     */
    private Long factoryId;

    /**
     * 跺码(UUID)
     */
    private String stackCode;

    /**
     * 任务id,跟task的主键关联
     */
    private Long taskId;

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
        return this.uploadId;
    }

}
