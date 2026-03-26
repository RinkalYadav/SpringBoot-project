package com.example.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
// by the help of primary its called laptop object
//@Primary
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compile with 404 bug");
    }
}
