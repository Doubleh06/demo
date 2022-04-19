package com.example.demo.controller;

import com.example.demo.factory.TestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestFactory testFactory;

    @RequestMapping("test")
    public String test(){
        testFactory.getTest();
        return "-------";
    }
}
