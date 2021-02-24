package com.project.modular.global.service.impl;

import com.project.modular.global.entity.Area;
import com.project.modular.global.mapper.AreaMapper;
import com.project.modular.global.service.IAreaService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 地区表（单库单表） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class AreaServiceImpl extends ServiceImpl<AreaMapper, Area> implements IAreaService {

}
