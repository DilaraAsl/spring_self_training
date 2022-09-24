package com.cydeo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class ParrotDemo {
    public static void main(String[] args) {
     var context=new AnnotationConfigApplicationContext(ParrotConfig.class);
    Person person=context.getBean(Person.class);
    Parrot parrot=context.getBean(Parrot.class);
        System.out.println(person.getParrot());
    }
}
