package com.example.MyApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public void compile(){
        System.out.println("Compile with bug 404 fast");
    }
}
