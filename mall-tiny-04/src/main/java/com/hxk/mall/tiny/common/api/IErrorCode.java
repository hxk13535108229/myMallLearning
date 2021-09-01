package com.hxk.mall.tiny.common.api;

/**
 * 封装api的错误码
 */
public interface IErrorCode {
    //获取状态码
    long getCode();

    //获取提示信息
    String getMessage();
}
