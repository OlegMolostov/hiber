package com.mol.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog dog=context.getBean("myPet",Dog.class);
        dog.say();

        Dog dog1=context.getBean("myPet",Dog.class);
        dog.say();
        context.close();

    }
}
