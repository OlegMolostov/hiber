package com.mol.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Set bean");
    }

    @Override
    public void say() {

        System.out.println("Mew-mew");
    }
}
