package com.mol.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.mol.spring")
@PropertySource("classpath:myApp.properties")
public class MyConfig {

    @Bean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person person(){
        return new Person(catBean());
    }
}
