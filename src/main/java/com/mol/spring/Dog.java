package com.mol.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component

public class Dog implements Pet {

    public void init() {
        System.out.println("init");
    }


    public void destroy(){
        System.out.println("destr");
    }

    public Dog() {
        System.out.println("Dog bean");
    }

    public void say() {
        System.out.println("Bow_wow");
    }
}
