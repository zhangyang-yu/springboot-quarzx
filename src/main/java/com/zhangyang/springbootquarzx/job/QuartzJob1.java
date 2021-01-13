package com.zhangyang.springbootquarzx.job;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
public class QuartzJob1 {
    //定时执行的方法
    public void myJobBusinessMethod() {

        System.out.println("定时器执行1");
    }
}
