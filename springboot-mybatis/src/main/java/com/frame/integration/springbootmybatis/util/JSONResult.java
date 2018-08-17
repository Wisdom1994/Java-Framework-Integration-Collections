package com.frame.integration.springbootmybatis.util;

import java.io.Serializable;

/**
 * @message 用于 return 的返回值对象，JSONObject
 * 
 * @version 1.0
 * @author wisdom Jiang
 * @createDate 2018年8月16日
 */
public class JSONResult implements Serializable {
    
    private static final long serialVersionUID = -4920956620340499213L;
    private static final Integer STATUS = 0;
    private static final String MESSAGE = "SUCCESS";

    /** 状态码 */
    private Integer status;
    
    /** 返回信息 */
    private String message;
    
    /** 数据 */
    private Object data;    
    
    // ---- 构造 start -----------------------------------------------------
    public JSONResult() {}
    
    public JSONResult(String message) {
        this.status = STATUS;
        this.message = message;
    }
    
    public JSONResult(Integer status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public JSONResult(Object data) {
        this.status = STATUS;
        this.message = MESSAGE;
        this.data = data;
    }
    // ---- 构造 end -------------------------------------------------------
    
    // Getters Setters
    public Integer getStatus() {
        return status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public Object getData() {
        return data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("JSONResult [status=");
        builder.append(status);
        builder.append(", message=");
        builder.append(message);
        builder.append(", data=");
        builder.append(data);
        builder.append("]");
        return builder.toString();
    }
}
