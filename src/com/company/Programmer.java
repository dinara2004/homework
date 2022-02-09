package com.company;

public class Programmer extends Person {
    String companyName;

    public Programmer() {
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;

    }

    void coding (){
        super.Learn();
        super.Walk();
        super.Eat();
        System.out.println("She likes coding.");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
