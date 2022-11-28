package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach anotherCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach == anotherCoach);
        System.out.println(theCoach);
        System.out.println(anotherCoach);
        context.close();
    }
}
