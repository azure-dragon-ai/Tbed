package cn.hjhai.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hjhai.dao.SysConfigMapper;
import cn.hjhai.pojo.SysConfig;
import cn.hjhai.service.SysConfigService;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/8/15 13:48
 */
@Service
public class SysConfigServiceImpl implements SysConfigService {
    @Autowired
    private SysConfigMapper sysConfigMapper;
    @Override
    public SysConfig getstate() {
        return sysConfigMapper.getstate();
    }

    @Override
    public Integer setstate(SysConfig sysConfig) {
        return sysConfigMapper.setstate(sysConfig);
    }
}
