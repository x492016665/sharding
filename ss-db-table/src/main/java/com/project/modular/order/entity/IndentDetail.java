package com.project.modular.order.entity;

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
 * 订单详情表（绑定表子表）
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class IndentDetail extends Model<IndentDetail> {

    private static final long serialVersionUID = 1L;

    /**
     * 详情id
     */
    @TableId(value = "detail_id", type = IdType.NONE)
    private Long detailId;

    /**
     * 订单id
     */
    private Long indentId;

    /**
     * 用户id,跟customer的主键关联
     */
    private Long customerId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 数量
     */
    private Integer num;

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
        return this.detailId;
    }

}
