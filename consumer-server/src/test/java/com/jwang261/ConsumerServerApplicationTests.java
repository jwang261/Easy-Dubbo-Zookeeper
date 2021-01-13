package com.jwang261;

import com.jwang261.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerServerApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void test(){
        userService.buyTicket();
    }

    @Test
    void contextLoads() {
    }

}
