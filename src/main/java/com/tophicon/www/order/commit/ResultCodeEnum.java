package com.tophicon.www.order.commit;

public enum ResultCodeEnum {
    /*** 通用部分 100 - 599***/
    // 成功请求
    SUCCESS(200, "successful"),
    // 重定向
    REDIRECT(301, "redirect"),
    // 资源未找到
    NOT_FOUND(404, "not found"),
    // 服务器错误
    SERVER_ERROR(500, "service error"),

    /*** 这里可以根据不同模块用不同的区级分开错误码，例如:  ***/
    //登录参数错误 User name error

    NO_USER(10001, "用户不存在"),
    NO_USERNAME(10002, "用户名为空"),
    NO_PASSWORD(10003, "密码名为空"),
    PASSWORD_ERR(10005, "密码错误"),
    COOKIE_NULL(10006, "没有登录信息"),
    //错误的token
    WRONG_TOKEN(10010,"token 错误"),
    //删除用户失败
    DELETE_USER_ERR(10011,"用户删除失败"),
    //用户更新失败
    UPDATE_USER_ERR(10011,"用户更新失败"),
    //用户添加失败
    INSERT_USER_ERR(10011,"用户添加失败"),
    USERNAME_REPEAT(10014, "用户名已存在"),
    //LOGIN_ERR(1020,"登录失败"),
    NO_ROLE(10031, "没有角色信息"),
    INPUT_PARAMETER_ERROR(10201,"输入参数错误"),

    //文件流错误
    FILE_STREAM_ERROR(2000, "File stream error"),
    PARAMETER_WRONG(20001,"参数错误"),
    FILE_PARAMETER_WRONG(20011,"文件数据错误"),
    //业务错误
    CANCEL_WORK_FAILED(3001, "cancel the work order is failed "),
    NO_DATA(3002,"没有数据"),
    //工单已经运行
    WORK_RUN(3010, "The work order has been run"),

    SQL_ERR(3020,"数据库操作错误")
//The work order has been run
    // 1000～1999 区间表示用户模块错误
    // 2000～2999 区间表示文件信息错误
    // 3000～3999 区间表示业务逻辑错误
    // 。。。

    ;
    /**
     * 响应状态码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;

    ResultCodeEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
