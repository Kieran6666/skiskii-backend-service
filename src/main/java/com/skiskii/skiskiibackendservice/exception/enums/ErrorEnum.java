package com.skiskii.skiskiibackendservice.exception.enums;

/**
 * 异常枚举
 */
public interface ErrorEnum {
    /**
     * 获取异常码
     *
     * @return 异常码
     */
    Integer getErrorCode();

    /**
     * 获取异常消息
     *
     * @return 异常消息
     */
    String getErrorMsg();
}
