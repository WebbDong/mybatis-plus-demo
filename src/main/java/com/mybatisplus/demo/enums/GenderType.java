package com.mybatisplus.demo.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

public enum GenderType implements IEnum<Integer> {

    SECRETIVE(0, "保密"),
    MALE(1, "男"),
    FEMALE(2, "女"),
    ;

    GenderType(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getDesc() {
        return desc;
    }

    private int value;

    private String desc;

}
