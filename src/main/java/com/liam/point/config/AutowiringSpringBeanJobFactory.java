//package com.liam.point.config;
//
//import org.quartz.spi.TriggerFiredBundle;
//import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.scheduling.quartz.SpringBeanJobFactory;
//
///**
// * @author: liangzy
// * @date: 2018/12/17 下午4:21
// * @desc: Quartz中的job自動注入spring容器託管的對象
// */
//public final class AutowiringSpringBeanJobFactory extends SpringBeanJobFactory
//        implements ApplicationContextAware {
//
//    private transient AutowireCapableBeanFactory beanFactory;
//
////Spring提供了一種機制讓你可以獲取ApplicationContext。就是ApplicationContextAware接口。
//// 對於一個實現了ApplicationContextAware接口的類，Spring會實例化它的同時
//// 調用它的setApplicationContext(ApplicationContext applicationContext)接口，將該bean所屬上下文傳遞給它。
//
//    @Override
//    public void setApplicationContext(final ApplicationContext context) {
//        beanFactory = context.getAutowireCapableBeanFactory();
//    }
//
//    @Override
//    protected Object createJobInstance(final TriggerFiredBundle bundle)
//            throws Exception {
//        final Object job = super.createJobInstance(bundle);
//        beanFactory.autowireBean(job);
//        return job;
//    }
//}
//
