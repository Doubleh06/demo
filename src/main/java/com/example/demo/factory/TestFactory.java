package com.example.demo.factory;

import com.example.demo.service.impl.impl.TestService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class TestFactory implements ApplicationContextAware, InitializingBean {
    ApplicationContext applicationContext;

    List<TestService> list = new ArrayList<>();
    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String,TestService> map = this.applicationContext.getBeansOfType(TestService.class);
        for(Map.Entry<String,TestService> entry : map.entrySet()){
            list.add(entry.getValue());
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void getTest(){
        for (TestService testService : list){
            testService.getTest();
        }
    }
}
