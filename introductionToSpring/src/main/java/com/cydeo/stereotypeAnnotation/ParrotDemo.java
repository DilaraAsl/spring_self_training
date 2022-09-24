package com.cydeo.stereotypeAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class ParrotDemo {
    public static void main(String[] args) {
     var context=new AnnotationConfigApplicationContext(ParrotConfig.class);
//     Parrot p=context.getBean(Parrot.class);
//        System.out.println(p); // @PostConstruct added
//        p.setName("Leslie");
//        System.out.println(p);

   Parrot x=new Parrot();
   x.setName("Lili");
        Supplier<Parrot> parrotSupplier=()->x;

        context.registerBean("parrot1",Parrot.class,parrotSupplier);
        Parrot p2=context.getBean(Parrot.class);
        System.out.println(p2.getName());
    }
}
