package com.zhangyang.springbootquarzx;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class ServiceImpi {

    @Scheduled(cron = "0/1 * * * * ? ")
    public  void  test() throws InterruptedException {
        System.out.println("这个是springboot定时器");
    }
}
