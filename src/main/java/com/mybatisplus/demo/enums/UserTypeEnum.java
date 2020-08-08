package com.mybatisplus.demo.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UserTypeEnum {

    CUSTOMER(0, "客户"),
    MERCHANT(1, "商家"),
    ;

    UserTypeEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }

    @EnumValue
    @JsonValue // 指明使用Jackson将枚举转换成json时，使用code的值
    private final int code;

    private final String name;

}
