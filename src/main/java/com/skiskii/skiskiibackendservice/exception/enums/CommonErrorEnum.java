package com.skiskii.skiskiibackendservice.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用异常码
 */
@AllArgsConstructor
@Getter
public enum CommonErrorEnum implements ErrorEnum {
    /**
     * 系统出小差了，请稍后再试哦~~
     */
    SYSTEM_ERROR(-1, "系统出小差了，请稍后再试哦~~"),
    /**
     * 参数校验失败
     */
    PARAM_VALID(-2, "参数校验失败{0}"),
    /**
     * 请求太频繁了，请稍后再试哦~~
     */
    FREQUENCY_LIMIT(-3, "请求太频繁了，请稍后再试哦~~"),
    /**
     * 请求太频繁了，请稍后再试哦~~
     */
    LOCK_LIMIT(-4, "请求太频繁了，请稍后再试哦~~");
    /**
     * 异常码
     */
    private final Integer code;
    /**
     * 异常消息
     */
    private final String msg;

    /**
     * 获取异常码
     *
     * @return 异常码
     */
    @Override
    public Integer getErrorCode() {
        return this.code;
    }

    /**
     * 获取异常消息
     *
     * @return 异常消息
     */
    @Override
    public String getErrorMsg() {
        return this.msg;
    }
}
