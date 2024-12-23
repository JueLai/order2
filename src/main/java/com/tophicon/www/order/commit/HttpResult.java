package com.tophicon.www.order.commit;


import com.tophicon.www.order.exception.MyRuntimeException;

import java.io.Serializable;

public class HttpResult<T> implements Serializable {

    /**
     * 是否响应成功
     * @mock true
     */
    private Boolean success;
    /**
     * 响应状态码
     * @mock 200
     */
    private Integer code;
    /**
     * 响应数据
     */
    private T data;
    /**
     * 错误信息
     * @mock
     */
    private String message;

    // 构造器开始

    /**
     * 无参构造器(构造器私有，外部不可以直接创建)
     */
    private HttpResult() {
        this.code = 200;
        this.success = true;
        this.message = "ok";
    }

    /**
     * 有参构造器
     *
     * @param obj
     */
    private HttpResult(T obj) {
        this.code = 200;
        this.data = obj;
        this.success = true;
        this.message = "ok";
    }

    /**
     * 有参构造器
     *
     * @param resultCode
     */
    private HttpResult(ResultCodeEnum resultCode) {
        this.success = false;
        this.code = resultCode.getCode();
        this.message = resultCode.getMessage();
    }    /**
     * 有参构造器
     *
     * @param resultCode
     */
    private HttpResult(ResultCodeEnum resultCode,T obj) {
        this.success = false;
        this.code = resultCode.getCode();
        this.data = obj;
        this.message = resultCode.getMessage();
    }  /**
     * 有参构造器
     *
     * @param resultCode
     */
    private HttpResult(Integer resultCode,String  message) {
        this.success = false;
        this.code = resultCode;
        this.message = message;
    }
    // 构造器结束

    /**
     * 通用返回成功（没有返回结果）
     *
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> success() {
        return new HttpResult();
    }

    /**
     * 返回成功（有返回结果）
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> success(T data) {
        return new HttpResult<T>(data);
    }

    /**
     * 通用返回失败
     *
     * @param resultCode
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> failure(ResultCodeEnum resultCode) {
        return new HttpResult<T>(resultCode);
    }

    /**
     * 通用返回失败
     *
     * @param resultCode
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> failure(Integer resultCode,String message) {
        return new HttpResult<T>(resultCode,message);
    }
    /**
     * 通用返回失败
     *
     * @param resultCode
     * @param <T>
     * @return
     */
    public static <T> HttpResult<T> failure(ResultCodeEnum resultCode, T data) {
        return new HttpResult<T>(resultCode,data);
    }


    public static <T> HttpResult<T> failure(MyRuntimeException exception) {
        HttpResult<T> tHttpResult = new HttpResult<>();
        tHttpResult.code=500;
        tHttpResult.success=false;
        tHttpResult.message=exception.getMessage();
        return tHttpResult;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "success=" + success +
                ", code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
