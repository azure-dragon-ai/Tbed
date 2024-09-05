package cn.hjhai.dao;

import cn.hjhai.pojo.Images;
import cn.hjhai.pojo.ImgTemp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @Entity dao.pojo.Imgdataexp
*/
@Mapper
public interface ImgTempMapper {

    List<Images> selectDelImgUidList(@Param("datatime") String datatime);
    Integer delImgAndExp(@Param("imguid") String imguid);
    Integer insertImgExp(ImgTemp imgDataExp);

}
