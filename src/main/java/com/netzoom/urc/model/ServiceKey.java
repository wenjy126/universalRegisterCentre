package com.netzoom.urc.model;

import com.netzoom.common.annotation.FieldName;
import lombok.Data;

import java.util.Date;

/**
 * 服务属性键信息实体类
 *
 * @author wenjy
 * @CreateTime 2019/9/3 9:53
 */
@Data
public class ServiceKey {

    @FieldName("id")
    private Integer id;

    @FieldName("键")
    private String key;

    @FieldName("值类型")
    private Integer valueType;

    @FieldName("备注")
    private String remark;

    @FieldName("创建时间")
    private Date createTime;
}
