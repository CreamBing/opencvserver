package com.bing.opencv.service;

import com.bing.opencv.dao.FaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* 人脸服务类:
*  1.根据两张图片地址返回相似度
*  */
@Service
public class FaceService {
    @Autowired
    FaceDao faceDao;

    //TODO 应该做成接口
    public Double getSimilarityBetween2Image(String url1, String url2) {
        return faceDao.getSimilarityBetween2Image(url1,url2);
    }
}
