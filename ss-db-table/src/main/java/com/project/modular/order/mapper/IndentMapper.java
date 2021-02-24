package com.project.modular.order.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.project.modular.order.entity.Indent;

/**
 * <p>
 * 订单表（绑定表父表） Mapper 接口
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
public interface IndentMapper extends BaseMapper<Indent> {

    List<Map<String, Object>> listByIndentId(@Param("indentId") Long indentId);

    List<Map<String, Object>> listByCustomerId(@Param("customerId") Long customerId);

    List<Map<String, Object>> listByName(@Param("customerName") String customerName);
}
