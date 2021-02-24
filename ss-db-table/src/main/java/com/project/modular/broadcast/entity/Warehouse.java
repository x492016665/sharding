package com.project.modular.broadcast.entity;

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
 * 仓库表（广播表）
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Warehouse extends Model<Warehouse> {

    private static final long serialVersionUID = 1L;

    /**
     * 仓库id
     */
    @TableId(value = "warehouse_id", type = IdType.ID_WORKER)
    private Long warehouseId;

    /**
     * 仓库名称
     */
    private String warehouseName;

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
        return this.warehouseId;
    }

    public Warehouse(String warehouseName) {
        this.warehouseName = warehouseName;
    }
}
