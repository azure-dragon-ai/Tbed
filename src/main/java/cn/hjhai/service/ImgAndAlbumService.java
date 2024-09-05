package cn.hjhai.service;

import org.springframework.stereotype.Service;

import cn.hjhai.pojo.Images;
import cn.hjhai.pojo.ImgAndAlbum;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023-12-18 22:29
 */
@Service
public interface ImgAndAlbumService {
    Integer addImgAndAlbum(ImgAndAlbum imgAndAlbum);

    List<ImgAndAlbum> getAlbumForImgname(String imgname);

    Integer deleteImgAndAlbum(String imgname);

    Integer deleteImgAndAlbumForKey(String albumkey);

    List<Images> selectImgForAlbumkey(String albumkey);
}
