package com.company;

public class Singer extends Person {
    String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }
    void singing (){
        System.out.println("He likes singing.");
    }
    void playGuitar (){
        super.Learn();
        super.Walk();
        super.Eat();
        System.out.println("He plays guitar very well.");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", bandName='" + bandName + '\'' +
                '}';
    }
}
