package com.jwang261.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    //想拿到provider-server提供的产品，就需要去注册中心拿
    @DubboReference //引用Pom坐标：可以定义路径相同的接口名
    TicketService ticketService;

    public void buyTicket(){
        String str = ticketService.getTicket();
        System.out.println("在注册中心拿到 -> " + str);
    }
}
