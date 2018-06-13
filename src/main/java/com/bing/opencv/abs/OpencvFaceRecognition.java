package com.bing.opencv.abs;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.core.MatOfInt;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import static org.opencv.imgproc.Imgproc.*;

@Component
public class OpencvFaceRecognition extends FaceRecognitionAbstract {

    static {
        System.load("E:\\DEV\\opencv\\opencv\\build\\java\\x64\\opencv_java341.dll");
    }

    @Override
    public Double getSimilarityBetween2Image(String url1, String url2) {
        List<Mat> listImage1 = new ArrayList<>();
        List<Mat> listImage2 = new ArrayList<>();
        Mat hsv_img1 = new Mat();
        Mat hsv_img2 = new Mat();
        Mat img1 = Imgcodecs.imread(url1, Imgcodecs.CV_LOAD_IMAGE_COLOR);
        Mat img2 = Imgcodecs.imread(url2, Imgcodecs.CV_LOAD_IMAGE_COLOR);
        cvtColor(img1,hsv_img1,COLOR_BGR2HSV);
        cvtColor(img2,hsv_img2,COLOR_BGR2HSV);
        listImage1.add(hsv_img1);
        listImage2.add(hsv_img2);

        Mat hist_img1 = new Mat();
        Mat hist_img2 = new Mat();

        MatOfFloat ranges = new MatOfFloat(0,255);
        MatOfInt histSize = new MatOfInt(50);
        MatOfInt channels = new MatOfInt(0);

        calcHist(listImage1,channels,new Mat(),hist_img1,histSize,ranges);
        calcHist(listImage2,channels,new Mat(),hist_img2,histSize,ranges);

        Core.normalize(hist_img1,hist_img1,0,1,Core.NORM_MINMAX,-1,new Mat());
        Core.normalize(hist_img2,hist_img2,0,1,Core.NORM_MINMAX,-1,new Mat());

        return compareHist(hist_img1,hist_img2, Imgproc.CV_COMP_CORREL);
    }


}
