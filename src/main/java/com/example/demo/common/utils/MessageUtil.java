package com.example.demo.common.utils;

import com.example.demo.common.beans.ResponseData;
import com.example.demo.common.constants.ProjectConstant;

public class MessageUtil {

    public static void setMessage(ResponseData<?> responseData, String message, String status){
        responseData.setMessage(message);
        responseData.setStatus(status);
    }
    public static void setMessageSuccess(ResponseData<?> responseData, String message){
        responseData.setMessage(message);
        responseData.setStatus(ProjectConstant.ResponseStatus.SUCCESS);
    }
    public static void setMessageSuccess(ResponseData<?> responseData){
    	responseData.setMessage(ProjectConstant.ResponseMessage.SUCCESS);
    	responseData.setStatus(ProjectConstant.ResponseStatus.SUCCESS);
    }
    public static void setMessageFail(ResponseData<?> responseData, String message){
        responseData.setMessage(message);
        responseData.setStatus(ProjectConstant.ResponseStatus.FAILED);
    }
    public static void setMessageFail(ResponseData<?> responseData){
    	responseData.setMessage(ProjectConstant.ResponseMessage.FAILED);
    	responseData.setStatus(ProjectConstant.ResponseStatus.FAILED);
    }
}
