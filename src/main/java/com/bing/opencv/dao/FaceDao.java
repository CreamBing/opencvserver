package com.bing.opencv.dao;

import org.springframework.stereotype.Component;

@Component
public interface FaceDao {
    //对比两张图片获取相似度
    Double getSimilarityBetween2Image (String url1,String url2);

}
