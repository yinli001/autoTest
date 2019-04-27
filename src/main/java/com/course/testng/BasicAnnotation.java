package com.course.testng;


import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void  testCase1(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
        System.out.println("Test测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.printf("Thread Id:%s%n",Thread.currentThread().getId());
        System.out.println("Test测试用例2");}

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("BeforeMethod这是在每个方法运行之后运行的");
    }

    @BeforeClass
    public void  beforeClass(){
        System.out.println("BeforeClass这是在类运行之后运行的方法");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass这时在类运行之后运行的方法");
    }
}

