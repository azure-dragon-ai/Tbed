package cn.hjhai.service;

import cn.hjhai.pojo.UploadConfig;
import org.springframework.stereotype.Service;

@Service
public interface UploadConfigService {

    UploadConfig getUpdateConfig();

    Integer setUpdateConfig(UploadConfig updateConfig);
}
