//package com.liam.point.config;
//
//import com.liam.point.task.ClearingRecordJob;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
//import org.springframework.scheduling.quartz.JobDetailFactoryBean;
//
///**
// * @author: liangzy
// * @date: 2018/12/17 下午6:24
// * @desc: 金币订单清算记录
// */
//@Configuration
//public class ClearingRecordTask {
//
//    @Bean(name="clearingRecordJob")
//    public JobDetailFactoryBean jobDetailFactoryBean(){
//        //生成JobDetail
//        JobDetailFactoryBean factory = new JobDetailFactoryBean();
//        //設置對應的Job
//        factory.setJobClass(ClearingRecordJob.class);
//        factory.setName("clearingRecordJob");
//        return factory;
//    }
//
//
//    @Bean(name="clearingRecordTrigger")
//    public CronTriggerFactoryBean cronTriggerFactoryBean(){
//        CronTriggerFactoryBean stFactory = new CronTriggerFactoryBean();
//        //設置JobDetail
//        stFactory.setJobDetail(jobDetailFactoryBean().getObject());
//        stFactory.setStartDelay(1000);
//        stFactory.setName("clearingRecordTrigger");
//        //定時任務時間配置
////        stFactory.setCronExpression("0/2 * * * * ?");
//        stFactory.setCronExpression("0 0 0 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24 * ? ");
//        return stFactory;
//    }
//}
