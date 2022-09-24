package com.cydeo.tasks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigParrot {
    @Primary
    @Bean("parrot")
    public Parrot parrot(){
        return new Parrot("Lilly");
    }
    @Bean("parrot1")
    public Parrot parrot1(){
        return new Parrot("Ralphy");
    }
    @Bean("parrot2")
    public Parrot parrot2(){
        return new Parrot("Kiki");

    }
    @Bean
    String hello(){
        return "hello";
    }
    @Bean
    Integer ten(){
        return 10;
    }
}
