package com.cbf.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author yingge
 * @Date 2022/9/7 22:09
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 每间隔5000ms执行一次
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次 "+ dateFormat.format(new Date()));
    }

    /**
     * 每天11点28份执行
     * cron表达式是类unix系统使用的,linux也使用
     * cron表达式规则: https://spring.io/blog/2020/11/10/new-in-spring-5-3-improved-cron-expressions
     */
    @Scheduled(cron = "0 28 11 ? * *" )
    public void fixTimeExecution(){
        System.out.println("在指定事件 "+ dateFormat.format(new Date()) + "执行");
    }
}
