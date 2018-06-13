package com.bing.opencv.dao.impl;

import com.bing.opencv.abs.FaceRecognitionAbstract;
import com.bing.opencv.dao.FaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FaceDaoImpl implements FaceDao {

    @Autowired
    FaceRecognitionAbstract faceRecognitionAbstract;

    @Override
    public Double getSimilarityBetween2Image(String url1, String url2) {
        return faceRecognitionAbstract.getSimilarityBetween2Image(url1,url2);
    }
}
