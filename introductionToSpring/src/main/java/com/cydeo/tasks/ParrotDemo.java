package com.cydeo.tasks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ParrotDemo {
    public static void main(String[] args) {
     var context=new AnnotationConfigApplicationContext(ConfigParrot.class);

        System.out.println(context.getBean("parrot"));


        String sayHello=context.getBean(String.class);
        System.out.println(sayHello);
        Integer tenTimes=context.getBean(Integer.class);
        System.out.println(tenTimes);

        System.out.println(context.getBean("parrot1"));
        Parrot p=context.getBean(Parrot.class);
        System.out.println(p.getName());

        Parrot p2=context.getBean("parrot2",Parrot.class);
        System.out.println(p2.getName());
    }
}
