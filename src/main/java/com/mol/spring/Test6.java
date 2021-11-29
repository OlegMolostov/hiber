package com.mol.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
//        Person person=context.getBean("person",Person.class);
//        person.callYouPet();

       Person person=context.getBean("person",Person.class);
       person.callYouPet();
        context.close();
    }
}
