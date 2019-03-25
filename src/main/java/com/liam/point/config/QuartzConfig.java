//package com.liam.point.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.config.PropertiesFactoryBean;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
//import org.springframework.scheduling.quartz.SchedulerFactoryBean;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//import java.util.Properties;
//
///**
// * @author: liangzy
// * @date: 2018/12/17 下午5:37
// * @desc:
// */
//
//@Configuration
//public class QuartzConfig {
//
//    @Autowired
//    @Qualifier("clearingRecordTrigger")
//    private CronTriggerFactoryBean clearingRecordTrigger;
//
////    第二个
////    @Autowired
////    @Qualifier("sendCallMsgTrigger")
////    private CronTriggerFactoryBean sendCallMsgTrigger;
//
//
//    /**
//     * @author: liangzy
//     * @date: 18-12-17 下午6:30
//     * @param: []
//     * @return: com.bana.servicecharge.config.AutowiringSpringBeanJobFactory
//     * @desc: Quartz中的job自動注入spring容器託管的對象
//     */
//    @Bean
//    public AutowiringSpringBeanJobFactory autoWiringSpringBeanJobFactory() {
//        return new AutowiringSpringBeanJobFactory();
//    }
//
//    @Bean
//    public SchedulerFactoryBean schedulerFactoryBean() throws IOException {
//        SchedulerFactoryBean scheduler = new SchedulerFactoryBean();
//        //配置Spring注入的Job類
//        scheduler.setJobFactory(autoWiringSpringBeanJobFactory());
//        scheduler.setQuartzProperties(quartzProperties());
//        scheduler.setDataSource(druidDataSource());
//        //這裏可以設置多個CronTriggerFactoryBean
//        scheduler.setTriggers(
//                clearingRecordTrigger.getObject()
////                ,sendCallMsgTrigger.getObject()
//        );
//        return scheduler;
//    }
//
//
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource druidDataSource() {
//        return new DruidDataSource();
//    }
//
//    @Bean
//    public Properties quartzProperties() throws IOException {
//        PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
//        propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
//        propertiesFactoryBean.afterPropertiesSet();
//        return propertiesFactoryBean.getObject();
//    }
//}
//
