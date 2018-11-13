package com.blove.common.result;

import java.io.Serializable;

public class BLResult<T> implements Serializable {
    private static final long serialVersionUID = -9147196270797580955L;

    /**
     * 状态码
     * 200 - 成功 其它 - 失败
     */
    private String code;
    /**
     * 返回消息
     * Success - 成功 其它 - 失败描述
     */
    private String message;
    /**
     * 结果
     */
    private T result;


}
