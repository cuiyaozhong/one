package com.example.one.util;

/**
 * @author 崔耀中
 * @since 2020-08-10
 */
public class Result<T> {

    private String code;

    private String message;

    private T data;


    public static Result sucess() {
        return sucess(null);
    }

    public static Result sucess(Object data) {
        Result result = new Result();
        result.setMessage(MessageEnum.SUCCEED.getMessage());
        result.setCode(MessageEnum.SUCCEED.getCode());
        result.setData(data);
        return result;
    }

    public static Result error(String code, String message) {
        Result result = new Result();
        result.setMessage(message);
        result.setCode(code);
        return result;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

}
