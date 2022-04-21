package com.example.demo.annotationTest;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class ActivityTestFactory implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext applicationContext;

    private Map<Integer,ActivityAbs> mapAbs;

    @Override
    public void run(String... args) throws Exception {
        Collection<ActivityAbs> lists = this.applicationContext.getBeansOfType(ActivityAbs.class).values();
        mapAbs = new HashMap<>(lists.size());
        for (ActivityAbs abs : lists){
            Class< ? extends ActivityAbs> aAbs = abs.getClass();
            ActivityTest annotation = aAbs.getAnnotation(ActivityTest.class);
            mapAbs.put(annotation.test0(),abs);
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void getAnnotation(Integer type){
        mapAbs.get(type).getTest();
//        mapAbs.forEach((k,v)->{
//            log.info("k:{},v:{}",k,v);
//        });
    }
}
