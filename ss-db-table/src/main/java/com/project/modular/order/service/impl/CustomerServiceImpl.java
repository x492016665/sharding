package com.project.modular.order.service.impl;

import com.project.modular.order.entity.Customer;
import com.project.modular.order.mapper.CustomerMapper;
import com.project.modular.order.service.ICustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表（水平拆分表） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements ICustomerService {

}
