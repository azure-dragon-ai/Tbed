package cn.hjhai.service.impl;

import cn.hjhai.dao.ImgTempMapper;
import cn.hjhai.pojo.Images;
import cn.hjhai.pojo.ImgTemp;
import cn.hjhai.service.ImgTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public class ImgTempServiceImpl implements ImgTempService {

    @Autowired
    ImgTempMapper imgDataExpMapper;


    @Override
    public List<Images> selectDelImgUidList(String datatime) {
        return imgDataExpMapper.selectDelImgUidList(datatime);
    }

    @Override
    public Integer delImgAndExp(String imguid) {
        return imgDataExpMapper.delImgAndExp(imguid);
    }

    @Override
    public Integer insertImgExp(ImgTemp imgDataExp) {
        return imgDataExpMapper.insertImgExp(imgDataExp);
    }
}
