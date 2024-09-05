package cn.hjhai.dao;

import org.apache.ibatis.annotations.Mapper;

import cn.hjhai.pojo.SysConfig;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/8/15 13:33
 */
@Mapper
public interface SysConfigMapper {
    SysConfig getstate();
    Integer setstate(SysConfig sysConfig);
}
