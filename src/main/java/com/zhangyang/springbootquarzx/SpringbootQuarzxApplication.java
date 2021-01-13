package com.zhangyang.springbootquarzx;

import com.zhangyang.springbootquarzx.job.QuartzJob1;
import com.zhangyang.springbootquarzx.job.QuartzJob2;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootQuarzxApplication {

    public static void main(String[] args) throws SchedulerException {

        SpringApplication.run(SpringbootQuarzxApplication.class, args);

        // 1. 创建JobDetail
        JobKey jobKey = new JobKey("hello", "hello");
        JobDetail jobDetail = JobBuilder.newJob(QuartzJob2.class) //
                .withIdentity(jobKey)//
                .build();

        // 2. 创建Trigger
        TriggerKey triggerKey = new TriggerKey("hello", "hello");
        SimpleTrigger trigger = TriggerBuilder.newTrigger()//
                .withIdentity(triggerKey)// 唯一标识
                .startNow()// 立即启动
                .withSchedule(SimpleScheduleBuilder//
                        .simpleSchedule()//
                        .withIntervalInSeconds(5)//
                        .repeatForever()//
                ).build();

        // 3. 创建Scheduler，并启动调度
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.scheduleJob(jobDetail, trigger);
        scheduler.start();

    }

}
