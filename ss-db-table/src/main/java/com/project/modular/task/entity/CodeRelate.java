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
 * 瓶箱垛关联表（绑定表子表）
 * </p>
 *
 * @author huangjg
 * @since 2020-04-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CodeRelate extends Model<CodeRelate> {

    private static final long serialVersionUID = 1L;

    /**
     * 关联id
     */
    @TableId(value = "relate_id", type = IdType.NONE)
    private Long relateId;

    /**
     * 垛码,跟task_upload的stack_code关联
     */
    private String stackCode;

    /**
     * 箱码
     */
    private String boxCode;

    /**
     * 瓶码
     */
    private String bottleCode;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;

    /**
     * 任务id,跟task的主键关联
     */
    private Long taskId;


    @Override
    protected Serializable pkVal() {
        return this.relateId;
    }

}
