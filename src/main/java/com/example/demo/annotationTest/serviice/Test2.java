package com.example.demo.annotationTest.serviice;

import com.example.demo.annotationTest.ActivityAbs;
import com.example.demo.annotationTest.ActivityTest;
import org.springframework.stereotype.Service;

@Service
@ActivityTest(test0 = 2)
public class Test2 extends ActivityAbs {
    @Override
    public void getTest() {
        System.out.println("test2");
    }
}
