package cn.hjhai.dao;

import cn.hjhai.pojo.UploadConfig;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UploadConfigMapper {
    UploadConfig getUpdateConfig();
    Integer setUpdateConfig(UploadConfig uploadConfig);
}
