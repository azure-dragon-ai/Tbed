package cn.hjhai.service.impl;

import cn.hjhai.dao.UploadConfigMapper;
import cn.hjhai.pojo.UploadConfig;
import cn.hjhai.service.UploadConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UploadConfigServiceImpl implements UploadConfigService {
    @Autowired
    private UploadConfigMapper uploadConfigMapper;

    @Override
    public UploadConfig getUpdateConfig() {
        return uploadConfigMapper.getUpdateConfig();
    }

    @Override
    public Integer setUpdateConfig(UploadConfig uploadConfig) {
        return uploadConfigMapper.setUpdateConfig(uploadConfig);
    }
}

