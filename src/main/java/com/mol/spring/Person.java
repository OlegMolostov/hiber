package com.mol.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Person {



    private Pet pet;
    @Value("${person.surname}")
    private String surname;
   @Value("${person.age}")
    private int age;


    public Person( Pet pet) {
        System.out.println("Person bean");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println("set surname");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Set age");
    }


    public void setPet(Pet pet) {
        System.out.println("Class person set Pet");
        this.pet = pet;
    }

    public void callYouPet(){
        System.out.println("Hello,pet");
        pet.say();
    }
}
