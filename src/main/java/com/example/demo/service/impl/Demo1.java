package com.example.demo.service.impl;

import com.example.demo.service.impl.impl.TestService;
import org.springframework.stereotype.Component;

@Component
public class Demo1 implements TestService {
    @Override
    public void getTest() {
        System.out.println("demo1");
    }
}
