package com.project.modular.order.entity;

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
 * 订单表（绑定表父表）
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Indent extends Model<Indent> {

    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    @TableId(value = "indent_id", type = IdType.ID_WORKER)
    private Long indentId;

    /**
     * 用户id,跟customer的主键关联
     */
    private Long customerId;

    /**
     * 仓库id,跟warehouse主键关联
     */
    private Long warehouseId;

    /**
     * 订单名称
     */
    private String indentName;

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
        return this.indentId;
    }
}
