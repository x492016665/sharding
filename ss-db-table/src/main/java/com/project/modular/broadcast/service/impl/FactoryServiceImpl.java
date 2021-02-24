package com.project.modular.broadcast.service.impl;

import com.project.modular.broadcast.entity.Factory;
import com.project.modular.broadcast.mapper.FactoryMapper;
import com.project.modular.broadcast.service.IFactoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 工厂表（广播表） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class FactoryServiceImpl extends ServiceImpl<FactoryMapper, Factory> implements IFactoryService {

}
