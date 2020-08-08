package com.mybatisplus.demo.enums;

public enum LogicDeletedStatus {

    NOT_DELETED(0, "未删除"),
    DELETED(1, "已删除"),
    ;

    LogicDeletedStatus(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    private int code;

    private String name;

}
