package com.zhangyang.springbootquarzx.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@Component
public class QuartzJob2 implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
       this.quarzx1();
    }
    public  void  quarzx1()
    {
        System.out.println("这个是job定时器");
    }
}
