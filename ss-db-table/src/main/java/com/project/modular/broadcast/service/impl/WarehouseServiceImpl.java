package com.project.modular.broadcast.service.impl;

import com.project.modular.broadcast.entity.Warehouse;
import com.project.modular.broadcast.mapper.WarehouseMapper;
import com.project.modular.broadcast.service.IWarehouseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仓库表（广播表） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class WarehouseServiceImpl extends ServiceImpl<WarehouseMapper, Warehouse> implements IWarehouseService {

}
