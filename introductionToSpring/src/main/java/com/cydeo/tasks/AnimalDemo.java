package com.cydeo.tasks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalDemo {
    public static void main(String[] args) {
        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigAnimal.class);
        Animal animal=container.getBean(Animal.class);
        Animal animal2=container.getBean("dog",Animal.class);
        System.out.println(animal);
        System.out.println(animal2);
    }
}
