package com.mybatisplus.demo.test;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mybatisplus.demo.enums.GenderType;
import com.mybatisplus.demo.enums.UserType;
import com.mybatisplus.demo.model.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class JsonTest {

    @Test
    public void testJackson() throws JsonProcessingException {
        User user = new User();
        user.setId(1291721057111175170L);
        user.setUserName("name1");
        user.setGender(GenderType.MALE);
        user.setPwd("123456");
        user.setUserType(UserType.MERCHANT);
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
        log.info("jsonstr = {}", jsonStr);
    }

    @Test
    public void testFastjson() {
        User user = new User();
        user.setId(1291721057111175170L);
        user.setUserName("name1");
        user.setGender(GenderType.FEMALE);
        user.setPwd("123456");
        user.setUserType(UserType.MERCHANT);
        log.info("jsonstr = {}", JSON.toJSONString(user));
    }

}
