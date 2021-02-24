package com.project.modular.global.service.impl;

import com.project.modular.global.entity.Config;
import com.project.modular.global.mapper.ConfigMapper;
import com.project.modular.global.service.IConfigService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 配置表（单库单表,UUID主键） 服务实现类
 * </p>
 *
 * @author huangjg
 * @since 2020-04-22
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements IConfigService {

}
