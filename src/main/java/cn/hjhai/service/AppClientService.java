package cn.hjhai.service;

import cn.hjhai.pojo.AppClient;
import org.springframework.stereotype.Service;

@Service
public interface AppClientService {

    AppClient getAppClientData( String id);

    Integer editAppClientData(AppClient appClient);
}
