package com.mol.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person=context.getBean("myPerson",Person.class);
        person.callYouPet();
        System.out.println(person.getAge()+person.getSurname());
        context.close();
    }
}
