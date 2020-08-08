package com.mybatisplus.demo.test;

import com.mybatisplus.demo.model.domain.Product;
import com.mybatisplus.demo.service.ProductService;
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
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testBatchSave() {
        Product entity = new Product();
        for (int i = 1; i <= 50; i++) {
            entity.setId(null);
            entity.setName("prod" + i);
            entity.setPrice(Money.of(CurrencyUnit.of("CNY"), 80.99 + i));
            productService.save(entity);
        }
    }

}
