package com.mol.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog=context.getBean("myPet",Dog.class);
        Dog myDog1=context.getBean("myPet",Dog.class);
//        myDog1.setName("1");
//        myDog.setName("2");
//
//        System.out.println(myDog1==myDog);
//        System.out.println(myDog1.getName()+" "+myDog.getName());
//        context.close();
    }
}
