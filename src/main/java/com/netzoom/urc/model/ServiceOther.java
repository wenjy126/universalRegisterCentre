package com.netzoom.urc.model;

import com.netzoom.common.annotation.FieldName;
import lombok.Data;

import java.util.Date;

/**
 * 服务其他信息实体类
 *
 * @author wenjy
 * @CreateTime 2019/9/3 9:48
 */
@Data
public class ServiceOther {

    @FieldName("id")
    private Integer id;

    @FieldName("键")
    private String key;

    @FieldName("值")
    private String value;

    @FieldName("服务id")
    private String serviceId;

    @FieldName("创建时间")
    private Date createTime;

}
