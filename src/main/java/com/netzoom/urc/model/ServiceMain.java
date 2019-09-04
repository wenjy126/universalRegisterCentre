package com.netzoom.urc.model;

import com.netzoom.common.annotation.FieldName;
import lombok.Data;

import java.util.Date;

/**
 * 服务主要信息实体类
 *
 * @author wenjy
 * @CreateTime 2019/9/2 15:04
 */
@Data
public class ServiceMain {

    @FieldName("服务id")
    private String serviceId;

    @FieldName("服务ip")
    private String ip;

    @FieldName("服务端口")
    private String port;

    @FieldName("服务名称")
    private int serviceName;

    @FieldName("健康检查地址")
    private String healthCheckAddress;

    @FieldName("注册中心类型")
    private Integer registerType;

    @FieldName("创建时间")
    private Date createTime;
}
