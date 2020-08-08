package com.mybatisplus.demo.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.Version;
import com.mybatisplus.demo.base.BaseEntity;
import com.mybatisplus.demo.mybatisplus.typehandler.MoneyTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.money.Money;

/**
 * <p>
 * 订单主表
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class OrderMain extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 订单名
     */
    private String name;

    /**
     * 订单金额,单位分
     */
    @TableField(typeHandler = MoneyTypeHandler.class)
    private Money fee;

    /**
     * 货币
     */
    private String currency;

    /**
     * 乐观锁版本
     */
    @Version
    private Integer version;

}
