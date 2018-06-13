package com.bing.opencv.abs;

import org.springframework.stereotype.Component;

/*
*  人脸识别抽象类:
*   1:用于提供抽象方法，可以用不同实现*/
@Component
public abstract class FaceRecognitionAbstract {

    abstract public Double getSimilarityBetween2Image (String url1,String url2);

}
