package com.project.modular.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.project.commom.response.CodeEnum;
import com.project.commom.response.ResponseData;
import com.project.modular.order.entity.Customer;
import com.project.modular.order.service.ICustomerService;

/**
 * <p>
 * 用户表（水平拆分表） 前端控制器
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @PostMapping("/save")
    public ResponseData<?> save() {
        List<Customer> list = new ArrayList<Customer>();
        list.add(new Customer("日向雏田"));
        list.add(new Customer("天天"));
        list.add(new Customer("小李"));
        list.add(new Customer("自来也"));
        customerService.saveBatch(list);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/list")
    public ResponseData<?> list() {
        List<Customer> aList = customerService.list();
        return ResponseData.out(CodeEnum.SUCCESS, aList);
    }

    @GetMapping("/listByName")
    public ResponseData<?> listByName(String name) {
        QueryWrapper<Customer> queryWrapper = new QueryWrapper<Customer>();
        queryWrapper.eq("customer_name", name);
        List<Customer> aList = customerService.list(queryWrapper);
        return ResponseData.out(CodeEnum.SUCCESS, aList);
    }

    @GetMapping("/update")
    public ResponseData<?> update(Long id) {
        Customer customer = new Customer("天津市");
        customer.setCustomerId(id);
        customerService.updateById(customer);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }

    @GetMapping("/delete")
    public ResponseData<?> delete(Long id) {
        customerService.removeById(id);
        return ResponseData.out(CodeEnum.SUCCESS, null);
    }
}
