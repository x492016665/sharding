package com.project.modular.order.service.impl;

import com.project.modular.order.entity.IndentDetail;
import com.project.modular.order.mapper.IndentDetailMapper;
import com.project.modular.order.service.IIndentDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单详情表（绑定表子表） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class IndentDetailServiceImpl extends ServiceImpl<IndentDetailMapper, IndentDetail> implements IIndentDetailService {

}
