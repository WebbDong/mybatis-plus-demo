package com.mybatisplus.demo.model.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mybatisplus.demo.base.BaseEntity;
import com.mybatisplus.demo.enums.GenderTypeEnum;
import com.mybatisplus.demo.enums.UserTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String pwd;

    /**
     * 性别
     */
    private GenderTypeEnum gender;

    /**
     * 用户类型
     */
    @JSONField(serialzeFeatures= SerializerFeature.WriteEnumUsingToString) // 指明使用Fastjson将枚举转换成json时，使用枚举的toString方法返回的值，可以重写toString来实现定制
    private UserTypeEnum userType;


}
