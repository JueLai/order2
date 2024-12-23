package com.tophicon.www.order.exception;

public class MyRuntimeException extends RuntimeException{
    String errMessage;
    public MyRuntimeException(String errMessage) {
        this.errMessage = errMessage;
    }

    public String getErrMessage() {
        return errMessage;
    }
}
