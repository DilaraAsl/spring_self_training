package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

public class ParrotConfig {
    @Bean
    public Parrot parrot(){
        return new Parrot("KIKI");
    }
    @Bean
    public Person person(){
        return new Person("Lili",parrot());
    }


}
