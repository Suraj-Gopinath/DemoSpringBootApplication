package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component

public class Dev {
    @Autowired
    @Qualifier("desktop")
    private Computer comp;
    public void getComputer(Computer computer){
        this.comp =  computer;
    }

    public void build(){
        System.out.println("Working on a Spring Project!!");
        comp.compile();
    }
}
