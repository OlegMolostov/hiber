package com.mol.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person=context.getBean("person",Person.class);
        person.callYouPet();
        System.out.println( person.getAge());
        context.close();
    }
}
