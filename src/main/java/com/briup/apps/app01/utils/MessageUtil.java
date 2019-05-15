package com.briup.apps.app01.utils;

import java.util.Date;

public class MessageUtil {
    public static Message success(String msg){
        Message message =new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(null);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    public static Message success(String msg,Object date){
        Message message =new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(date);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    public static Message success(Object date){
        Message message =new Message();
        message.setStatus(200);
        message.setMessage("success");
        message.setData(date);
        message.setTimestamp(new Date().getTime());
        return message;
    }
    public static Message error(String msg){
        Message message =new Message();
        message.setStatus(500);
        message.setMessage(msg);
        message.setData(null);
        message.setTimestamp(new Date().getTime());
        return message;
    }
}
