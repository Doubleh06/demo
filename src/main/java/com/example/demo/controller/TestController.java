package com.example.demo.controller;

import com.example.demo.annotationTest.ActivityTestFactory;
import com.example.demo.factory.TestFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private TestFactory testFactory;
    @Autowired
    private ActivityTestFactory factory;

    @RequestMapping("test")
    public String test(@RequestParam Integer type){
        factory.getAnnotation(type);
        return "-------";
    }
}
