package com.bing.opencv.controller;

import com.bing.opencv.bean.formBean.FaceRecognitionFormBean;
import com.bing.opencv.bean.result.ResponseData;
import com.bing.opencv.bean.result.ResultCode;
import com.bing.opencv.service.FaceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

/*
*  face控制类
*  主要包括人脸相关接口:
*   1.根据人脸地址返回相似度
*   */

@RequestMapping("/face")
@RestController
public class FaceController {

    private static final Logger log = LoggerFactory.getLogger(FaceController.class);

    @Autowired
    FaceService faceService;

    @PostMapping("/getOpencvFaceRecognition")
    public ResponseData getSimilarityBetween2Image(@RequestBody FaceRecognitionFormBean recognitionFormBean){
        ResponseData res;
        try{
            Path path1 = Paths.get(recognitionFormBean.getUrl1());
            Path path2 = Paths.get(recognitionFormBean.getUrl2());
            if(!Files.exists(path1)||!Files.exists(path2)){
                return ResponseData.buildErrorMessageResponse(ResultCode.BAD_REQUEST.getCode(),"图片地址不存在");
            }
            Double similarity = faceService.getSimilarityBetween2Image(recognitionFormBean.getUrl1(),recognitionFormBean.getUrl2());
            Map<String,Object> resultMap = new HashMap<>();
            resultMap.put("similarity",similarity);
            res = ResponseData.buildNormalInfoResponse(resultMap);
        }catch (Exception e){
            //TODO 应该向上抛出统一处理
            log.error("人脸比对发生异常:[{}]",e.getMessage());
            res = ResponseData.buildErrorMessageResponse(ResultCode.SERVER_INTERNAL_ERROR.getCode(),ResultCode.SERVER_INTERNAL_ERROR.getMsg());
        }
        return res;
    }

}