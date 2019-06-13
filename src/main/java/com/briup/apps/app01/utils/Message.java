package com.briup.apps.app01.utils;

/**
 * @program: app01
 * @description: 统一消息
 * @author: CC
 * @create: 2019/05/06 20:25
 */
public class Message {
    private Integer status;
    private String message;
    private Object data;
    private Long timestamp;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
