package com.bing.opencv.bean.result;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class ResultStatus implements Serializable{
	private static final long serialVersionUID = -4517381632644686795L;

	public  static  final int RESULT_OK=200 ;
    
    private Integer statusCode = 200;
    
    private String statusInfo = "成功";
    
    private Object statusResult;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusInfo() {
		return statusInfo;
	}

	public void setStatusInfo(String statusInfo) {
		this.statusInfo = statusInfo;
	}

	public Object getStatusResult() {
		return statusResult;
	}

	public void setStatusResult(Object statusResult) {
		this.statusResult = statusResult;
	}
	
	public static ResultStatus buildNormalResponse(int code,String message,Object info) {
		ResultStatus data = new ResultStatus();
		data.setStatusCode(code);
		data.setStatusInfo(message);
		data.setStatusResult(info);
		return data;
	}
	
	public static ResultStatus buildNormalResponse(String message, Object info) {
		ResultStatus data = new ResultStatus();
		data.setStatusInfo(message);
		data.setStatusResult(info);
		return data;
	}

	public static ResultStatus buildNormalInfoResponse(Object info) {
		ResultStatus data = new ResultStatus();
		data.setStatusResult(info);
		return data;
	}

	public static ResultStatus buildNormalInfoResponse(Object info, boolean defaultMessage) {
		ResultStatus data = new ResultStatus();
		data.setStatusInfo("失败");
		if (defaultMessage) {
			data.setStatusInfo("成功");
		}
		data.setStatusResult(info);
		return data;
	}

	public static ResultStatus buildNormalMessageResponse(String message) {
		ResultStatus data = new ResultStatus();
		data.setStatusInfo(message);
		return data;
	}

	public static ResultStatus buildErrorMessageResponse(int code, String message) {
		ResultStatus data = new ResultStatus();
		data.setStatusCode(code);
		data.setStatusInfo(message);
		return data;
	}

	public static ResultStatus buildErrorMessageResponse(int code, String message, Object info) {
		ResultStatus data = new ResultStatus();
		data.setStatusCode(code);
		data.setStatusInfo(message);		
		data.setStatusResult(info);
		return data;
	}

	public static ResultStatus buildErrorMessageResponse(int code) {
		ResultStatus data = new ResultStatus();
		data.setStatusCode(code);
		if(code != 200) {
			data.setStatusInfo("无效代码!!!");			
			data.setStatusResult("无效结果!!!");
		}		
		return data;
	}
	
	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}
}
