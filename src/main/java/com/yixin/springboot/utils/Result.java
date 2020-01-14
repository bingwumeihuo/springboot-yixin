package com.yixin.springboot.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * 服务端响应结果封装类
 * @author 2mawenxin
 */
@Data
public class Result implements Serializable{
    private boolean flag;
    private int code;
    private String message;
    private Object data;

    public Result(){

    }


    public Result(boolean flag, int code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }


    public Result(boolean flag, int code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }


    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
