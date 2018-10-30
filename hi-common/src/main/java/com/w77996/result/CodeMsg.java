package com.w77996.result;

import lombok.Data;

/**
 * @author w77996
 */
@Data
public class CodeMsg {

    /**
     * 状态码
     */
    private int code;
    /**
     * 错误信息
     */
    private String message;

    /**
     * 通用的错误码
     */
    public static CodeMsg SUCCESS = new CodeMsg(200, "success");
    public static CodeMsg ERROR = new CodeMsg(-200, "success");


    public CodeMsg(int code, String msg) {
        this.code = code;
        this.message = msg;
    }


    public CodeMsg fillArgs(Object... args) {
        int code = this.code;
        String message = String.format(this.message, args);
        return new CodeMsg(code, message);
    }

}
