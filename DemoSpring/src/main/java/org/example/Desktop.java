package org.example;

public class Desktop implements Computer {

    public Desktop(){
        System.out.println("desk constructor");
    }

    public void compile() {
        System.out.println("compiling with desktop");
    }
}
