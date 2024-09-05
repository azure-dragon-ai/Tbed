package cn.hjhai.service.impl;

import com.alibaba.fastjson.JSONArray;

import cn.hjhai.dao.AlbumMapper;
import cn.hjhai.dao.ImgAndAlbumMapper;
import cn.hjhai.dao.ImgMapper;
import cn.hjhai.exception.CodeException;
import cn.hjhai.pojo.Album;
import cn.hjhai.pojo.Images;
import cn.hjhai.pojo.ImgAndAlbum;
import cn.hjhai.service.AlbumService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023-12-18 22:30
 */
@Service
public class AlbumServiceImpl implements AlbumService {
  @Autowired AlbumMapper albumMapper;
  @Autowired ImgAndAlbumMapper andAlbumMapper;
  @Autowired ImgMapper imgMapper;

  @Override
  public JSONArray getAlbumList(JSONArray array) {
    JSONArray jsonArray = new JSONArray();
    for (int i = 0; i < array.size(); i++) {
      Images images = new Images();
      images.setImguid(array.getString(i));
      jsonArray.add(imgMapper.selectimg(images).get(0));
    }
    return jsonArray;
  }

  @Override
  public Album selectAlbum(Album album) {
    return albumMapper.selectAlbum(album);
  }

  @Override
  public Integer addAlbum(Album album) {
    return albumMapper.addAlbum(album);
  }

  @Transactional
  public Integer addAlbumForImgAndAlbumMapper(ImgAndAlbum imgAndAlbum) {
    Integer tem = 0;
    Integer r2 = andAlbumMapper.addImgAndAlbum(imgAndAlbum);
    if (r2 > 0) {
      tem = 1;
    } else {
      throw new CodeException("插入画廊数据失败，回滚");
    }
    return tem;
  }

  @Override
  public Integer deleteAlbum(String albumkey) {
    return albumMapper.deleteAlbum(albumkey);
  }

  @Override
  public List<Album> selectAlbumURLList(Album album) {
    return albumMapper.selectAlbumURLList(album);
  }

  @Override
  public Integer selectAlbumCount(Integer userid) {
    return albumMapper.selectAlbumCount(userid);
  }

  @Override
  public Integer updateAlbum(Album album) {
    return albumMapper.updateAlbum(album);
  }

  @Transactional
  public Integer delete(String albumkey) {
    Integer ret1 = albumMapper.deleteAlbum(albumkey);
    if (ret1 > 0) {
      ret1 = andAlbumMapper.deleteImgAndAlbumForKey(albumkey);
    } else {
      throw new CodeException("删除画廊失败。");
    }
    return ret1;
  }

  @Transactional
  public Integer deleteAll(String[] albumkeyArr) {
    Integer ret1 = 0;
    for (String s : albumkeyArr) {
      ret1 = albumMapper.deleteAlbum(s);
      if (ret1 > 0) {
        ret1 = andAlbumMapper.deleteImgAndAlbumForKey(s);
      } else {
        throw new CodeException("删除画廊失败。");
      }
    }
    return ret1;
  }
}
