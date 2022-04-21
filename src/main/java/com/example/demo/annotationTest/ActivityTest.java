package com.example.demo.annotationTest;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ActivityTest {
    int test0() default 0;
}
