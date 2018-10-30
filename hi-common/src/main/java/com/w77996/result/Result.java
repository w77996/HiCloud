package com.w77996.result;

import lombok.Data;

/**
 * @author w77996
 * @param <T>
 */
@Data
public class Result<T> {

    private int code = 200;
    private String message = "success";
    private T data;

    /**
     * 成功时候的调用
     */
    public static <T> Result<T> success(T data) {
        return new Result(data);
    }

    public static<T> Result<T> success(){
        return new Result();
    }

    public static <T> Result<T> success(String msg,T data) {
        return new Result(msg,data);
    }

    public static<T> Result<T> success(Integer code,String msg,T data){


        return new Result(code,msg,data);
    }
    /**
     * 失败时候的调用
     */
    public static <T> Result<T> error(CodeMsg codeMsg) {
        return new Result<T>(codeMsg);
    }
    public static <T> Result<T> error(CodeMsg codeMsg,String message) {
        codeMsg.setMessage(message);
        return new Result<T>(codeMsg);
    }

    private Result(){

    }
    private Result(T data) {
        this.data = data;
    }

    private Result(String msg,T data){
        this.message = msg;
        this.data = data;
    }

    private Result(int code, String msg) {
        this.code = code;
        this.message = msg;
    }
    private Result(int code,String message,T data){
        this.message = message;
        this.code = code;
        this.data = data;
    }
    private Result(CodeMsg codeMsg) {
        if (codeMsg != null) {
            this.code = codeMsg.getCode();
            this.message = codeMsg.getMessage();
        }
    }

}
