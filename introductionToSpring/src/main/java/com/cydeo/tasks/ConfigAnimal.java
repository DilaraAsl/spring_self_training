package com.cydeo.tasks;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigAnimal {
    @Bean
    public Animal catBean(){
        return new Animal("cat");
    }
    @Bean("dog")
    public Animal dogBean(){
        return new Animal("dog");
    }
    @Bean
    @Primary
    public Animal tigerBean(){
        return new Animal("tiger");
    }
}
