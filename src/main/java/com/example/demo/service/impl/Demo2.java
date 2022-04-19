package com.example.demo.service.impl;

import com.example.demo.service.impl.impl.TestService;
import org.springframework.stereotype.Component;

@Component
public class Demo2 implements TestService {
    @Override
    public void getTest() {
        System.out.println("demo2");
    }
}
