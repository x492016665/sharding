package com.project.modular.order.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.modular.order.entity.Indent;
import com.project.modular.order.mapper.IndentMapper;
import com.project.modular.order.service.IIndentService;

/**
 * <p>
 * 订单表（绑定表父表） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class IndentServiceImpl extends ServiceImpl<IndentMapper, Indent> implements IIndentService {

    @Autowired
    private IndentMapper indentMapper;

    @Override
    public List<Map<String, Object>> listByIndentId(Long indentId) {
        // TODO Auto-generated method stub
        return indentMapper.listByIndentId(indentId);
    }

    @Override
    public List<Map<String, Object>> listByCustomerId(Long customerId) {
        // TODO Auto-generated method stub
        return indentMapper.listByCustomerId(customerId);
    }

    @Override
    public List<Map<String, Object>> listByName(String customerName) {
        // TODO Auto-generated method stub
        return indentMapper.listByName(customerName);
    }
}
