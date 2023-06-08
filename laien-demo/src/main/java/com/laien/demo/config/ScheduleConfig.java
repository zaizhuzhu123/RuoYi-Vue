//package com.laien.demo.config;
//
//import jodd.util.concurrent.ThreadFactoryBuilder;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.SchedulingConfigurer;
//import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//
//import java.util.concurrent.Executors;
//import java.util.concurrent.ThreadFactory;
//
//@Configuration
//public class ScheduleConfig implements SchedulingConfigurer {
//    @Override
//    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("schedule-pool-%d").get();
//        taskRegistrar.setScheduler(Executors.newScheduledThreadPool(2, threadFactory));
//    }
//}