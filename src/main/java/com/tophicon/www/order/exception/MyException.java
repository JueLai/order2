package com.tophicon.www.order.exception;


import com.tophicon.www.order.commit.ResultCodeEnum;

/**
 * 用户信息异常
 */
public class MyException extends Exception {
    private  int mCode;
    private  String mMessage;
    private ResultCodeEnum mNumber;

    public int getmCode() {
        return mCode;
    }

    public String getmMessage() {
        return mMessage;
    }
    public MyException(ResultCodeEnum id) {
        super(id.getMessage());
        this.mNumber = id;
    }
    public MyException(int code,String message) {
        super(message);
        this.mCode = code;
        this.mMessage = message;
    }
    public ResultCodeEnum getIdnumber() {
        return mNumber;
    }
}
