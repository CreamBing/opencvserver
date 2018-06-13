package com.bing.opencv;

import com.bing.opencv.service.FaceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OpencvServerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FaceServiceTest {

    @Autowired
    FaceService faceService;

    @Test
    public void getSimilarityBetween2ImageTest(){
        String filename1 = "E:\\DEV\\18WR250001_0_20180520195434444.jpg";
//        String filename2 = "E:\\DEV\\18WR250001_0_20180520195434444.jpg";
        String filename2 = "E:\\DEV\\18WR250001_0_20180520195419713.jpg";
        System.out.println(faceService.getSimilarityBetween2Image(filename1,filename2));
    }
}

