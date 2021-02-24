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
 * 用户表（水平拆分表）
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Customer extends Model<Customer> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户id
     */
    @TableId(value = "customer_id", type = IdType.NONE)
    private Long customerId;

    /**
     * 用户姓名
     */
    private String customerName;

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
        return this.customerId;
    }

    public Customer(String customerName) {
        this.customerName = customerName;
    }
}
