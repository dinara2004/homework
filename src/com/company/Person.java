package com.company;

import java.sql.SQLOutput;

public class Person {
    String name;
    String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void Learn (){
        System.out.println("Everyone studies perfectly.");
    }
    void Walk (){
        System.out.println("Everyone always walks in the morning.");
    }
    void Eat (){
        System.out.println("Everyone eats in time.");
    }

}
