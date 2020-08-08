package com.mybatisplus.demo.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.mybatisplus.demo.base.BaseEntity;
import com.mybatisplus.demo.mybatisplus.typehandler.MoneyTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.joda.money.Money;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author Webb Dong
 * @since 2020-08-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Product extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品价格,单位分
     */
    @TableField(typeHandler = MoneyTypeHandler.class)
    private Money price;

}
