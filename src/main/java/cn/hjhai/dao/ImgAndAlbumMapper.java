package cn.hjhai.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.hjhai.pojo.Images;
import cn.hjhai.pojo.ImgAndAlbum;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023-12-18 22:15
 */
@Mapper
public interface ImgAndAlbumMapper {
    Integer addImgAndAlbum(ImgAndAlbum imgAndAlbum);

    List<ImgAndAlbum> getAlbumForImgname(@Param("imgname") String imgname);

    Integer deleteImgAndAlbum(@Param("imgname") String imgname);

    Integer deleteImgAndAlbumForKey(@Param("albumkey") String albumkey);

    List<Images> selectImgForAlbumkey(@Param("albumkey") String albumkey);
}
