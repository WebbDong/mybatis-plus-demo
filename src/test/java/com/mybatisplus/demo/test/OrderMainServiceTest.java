package com.mybatisplus.demo.test;

import com.mybatisplus.demo.model.domain.OrderMain;
import com.mybatisplus.demo.service.OrderMainService;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderMainServiceTest {

    @Autowired
    private OrderMainService orderMainService;

    @Test
    public void testSave() {
        OrderMain entity = new OrderMain();
        entity.setName("购物订单");
        entity.setFee(Money.parse("CNY 40.99"));
        entity.setCurrency("CNY");
        entity.setVersion(0);
        orderMainService.save(entity);
        log.info("id = {}", entity.getId());
    }

    @Test
    public void testBatchSave() {
        OrderMain entity = new OrderMain();
        for (int i = 1; i < 50; i++) {
            entity.setId(null);
            entity.setName("测试订单" + i);
            entity.setFee(Money.of(CurrencyUnit.of("CNY"), 69.99 + i));
            entity.setCurrency("CNY");
            entity.setVersion(0);
            orderMainService.save(entity);
        }
    }

    @Test
    public void testGetById() {
        OrderMain order = orderMainService.getById(1291740410162573313L);
        log.info(order.toString());
    }

    @Test
    public void testGetByIdIgnoreLogicDeleted() {
        OrderMain order = orderMainService.getByIdIgnoreLogicDeleted(1291377551708577793L);
        log.info(order.toString());
    }

    @Test
    public void testRemoveById() {
        boolean b = orderMainService.removeById(1291377551708577793L);
        log.info(String.valueOf(b));
    }

    @Test
    public void testUpdateById() {
        OrderMain order = orderMainService.getById(1291756979114565633L);
        order.setFee(Money.of(CurrencyUnit.of("CNY"), 2000000));
        order.setName("修改2");
        boolean isSuccess = orderMainService.updateById(order);
        log.info(isSuccess ? "修改成功" : "修改失败");
    }

}
