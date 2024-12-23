package com.tophicon.www.order.exception;


import com.tophicon.www.order.commit.HttpResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Logger;

/**
 * 全局异常处理之RestFul
 */
@ControllerAdvice
public class GlobalExceptionHandlerRest {

//    @ExceptionHandler(value = MysqlDataTruncation.class)
//    @ResponseBody
//    public HttpResult<String> SqlExcept(Exception e) {
//        Exception e1 = e;
//        return HttpResult.failure(ResultCodeEnum.SQL_ERR, e.getMessage());
//    }

//    @ExceptionHandler(value = MyException.class)
//    @ResponseBody
//    public HttpResult<String> MyExceptionHandler(MyException e) {
//        ResultCodeEnum idNumber = e.getIdnumber();
//        if(idNumber == null)return HttpResult.failure(e.getmCode(),e.getmMessage());
//        return HttpResult.failure(idNumber);
//    }

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public HttpResult<String> MyRuntimeException(MyException e) {
        return HttpResult.failure(e.getIdnumber());
    }

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public HttpResult<String> MyRuntimeException(Exception e) {
        e.printStackTrace();
        return HttpResult.failure(500, e.getMessage());
    }

    @ExceptionHandler(value = SQLIntegrityConstraintViolationException.class)
    @ResponseBody
    public HttpResult<String> SQLIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException e) {
        return HttpResult.failure(12233, "数据库约束错误");
    }

//    @ExceptionHandler(value = UserRuntimeException.class)
//    @ResponseBody
//    public HttpResult<String> exceptionHandler(Exception e) {
//        Exception e1 = e;
//        UserRuntimeException userException = (UserRuntimeException) e;
//        ErrorEnum errorEnum = userException.errorEnum;
//        return HttpResult.failure(errorEnum);
//    }
}
