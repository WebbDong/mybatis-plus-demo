package com.mybatisplus.demo.mybatisplus.enums;

/**
 * 自定义Base方法SQL枚举
 */
public enum MySqlMethod {

    GET_BY_ID_IGNORE_LOGIC_DELETED("getByIdIgnoreLogicDeleted", "根据id查询，忽略逻辑删除", "SELECT %s FROM %s WHERE %s=#{%s}");

    private final String method;
    private final String desc;
    private final String sql;

    MySqlMethod(String method, String desc, String sql) {
        this.method = method;
        this.desc = desc;
        this.sql = sql;
    }

    public String getMethod() {
        return method;
    }

    public String getDesc() {
        return desc;
    }

    public String getSql() {
        return sql;
    }

}
