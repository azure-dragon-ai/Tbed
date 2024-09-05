package cn.hjhai.service.impl;

import cn.hjhai.dao.AppClientMapper;
import cn.hjhai.pojo.AppClient;
import cn.hjhai.service.AppClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppClientServiceImpl implements AppClientService {

    @Autowired
    AppClientMapper appClientMapper;


    @Override
    public AppClient getAppClientData(String id) {
        return appClientMapper.getAppClientData(id);
    }

    @Override
    public Integer editAppClientData(AppClient appClient) {
        return appClientMapper.editAppClientData(appClient);
    }
}
