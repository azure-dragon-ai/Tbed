package cn.hjhai.service;

import cn.hjhai.pojo.Images;
import cn.hjhai.pojo.ImgTemp;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*
*/
@Service
public interface ImgTempService {
    List<Images> selectDelImgUidList(String datatime);

    Integer delImgAndExp(String imguid);

    Integer insertImgExp(ImgTemp imgDataExp);
}
