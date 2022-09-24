package com.cydeo.stereotypeAnnotation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Getter
@Setter
@ToString
@Component("parrot1")
public class Parrot {
    private String name;
    @PostConstruct // javax.annotation.api added as dependecy to Maven
    public void init(){
        this.name="Kiki";
    }

}
