package com.skiskii.skiskiibackendservice.domain.vo.response;

import com.skiskii.skiskiibackendservice.exception.enums.ErrorEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 接口返回体
 *
 * @param <T> 返回数据
 */
@Data
@ApiModel("接口返回体")
public class ApiResult<T> {
    @ApiModelProperty("成功标识")
    private Boolean success;

    @ApiModelProperty("错误码")
    private Integer errorCode;

    @ApiModelProperty("错误消息")
    private String errorMsg;

    @ApiModelProperty("返回数据")
    private T data;

    /**
     * 成功
     *
     * @param <T> T
     * @return 结果
     */
    public static <T> ApiResult<T> success() {
        ApiResult<T> result = new ApiResult<>();
        result.setSuccess(Boolean.TRUE);
        result.setData(null);
        return result;
    }

    /**
     * 成功
     * @param data 返回数据
     * @param <T> T
     * @return 结果
     */
    public static <T> ApiResult<T> success(T data) {
        ApiResult<T> result = new ApiResult<>();
        result.setSuccess(Boolean.TRUE);
        result.setData(data);
        return result;
    }

    /**
     * 失败
     *
     * @param errCode 失败码
     * @param errMsg 失败消息
     * @param <T> T
     * @return 结果
     */
    public static <T> ApiResult<T> fail(Integer errCode, String errMsg) {
        ApiResult<T> result = new ApiResult<>();
        result.setSuccess(Boolean.FALSE);
        result.setErrorCode(errCode);
        result.setErrorMsg(errMsg);
        return result;
    }

    /**
     * 失败
     *
     * @param errorEnum 错误枚举
     * @param <T> T
     * @return 结果
     */
    public static <T> ApiResult<T> fail(ErrorEnum errorEnum) {
        ApiResult<T> result = new ApiResult<>();
        result.setSuccess(Boolean.FALSE);
        result.setErrorCode(errorEnum.getErrorCode());
        result.setErrorMsg(errorEnum.getErrorMsg());
        return result;
    }

}
