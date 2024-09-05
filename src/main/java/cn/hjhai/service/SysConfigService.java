package cn.hjhai.service;

import org.springframework.stereotype.Service;

import cn.hjhai.pojo.SysConfig;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/8/15 13:46
 */
@Service
public interface SysConfigService {
    SysConfig getstate();

    Integer setstate(SysConfig sysConfig);
}
