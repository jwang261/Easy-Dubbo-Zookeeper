package com.jwang261.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "jwang261";
    }
}
