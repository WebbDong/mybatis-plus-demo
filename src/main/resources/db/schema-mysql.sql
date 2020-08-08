DROP TABLE IF EXISTS `order_main`;

CREATE TABLE `order_main`
(
    `id` BIGINT(20) NOT NULL COMMENT '主键ID',
    `name` VARCHAR(30) NULL DEFAULT NULL COMMENT '订单名',
    `fee` BIGINT NOT NULL COMMENT '订单金额,单位分',
    `currency` VARCHAR(5) NOT NULL COMMENT '货币',
    `version` INTEGER NOT NULL COMMENT '乐观锁版本',
    `create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
    `update_time` TIMESTAMP NOT NULL COMMENT '创建时间',
    `deleted` TINYINT NOT NULL COMMENT '逻辑删除,1删除、0未删除',
    PRIMARY KEY (id)
) COMMENT '订单主表';

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`
(
    `id` BIGINT(20) NOT NULL COMMENT '主键ID',
    `user_name` VARCHAR(30) NULL DEFAULT NULL COMMENT '用户名',
    `pwd` VARCHAR(10) NOT NULL COMMENT '密码',
    `gender` TINYINT NOT NULL COMMENT '性别',
    `user_type` TINYINT NOT NULL COMMENT '用户类型',
    `create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
    `update_time` TIMESTAMP NOT NULL COMMENT '创建时间',
    `deleted` TINYINT NOT NULL COMMENT '逻辑删除,1删除、0未删除',
    PRIMARY KEY (id)
) COMMENT '用户';

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product`
(
    `id` BIGINT(20) NOT NULL COMMENT '主键ID',
    `name` VARCHAR(30) NULL DEFAULT NULL COMMENT '商品名',
    `price` BIGINT NOT NULL COMMENT '商品价格,单位分',
    `create_time` TIMESTAMP NOT NULL COMMENT '创建时间',
    `update_time` TIMESTAMP NOT NULL COMMENT '创建时间',
    `deleted` TINYINT NOT NULL COMMENT '逻辑删除,1删除、0未删除',
    PRIMARY KEY (id)
) COMMENT '商品';
