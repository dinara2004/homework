package com.company;

public class Main {

    public static void main(String[] args) {
	Programmer programmer = new Programmer("Dinara", "Programmer", "Peaksoft");
    Dancer dancer = new Dancer("Kasiet", "Dancer","Muras");
    Singer singer = new Singer("Keremet","Singer","Alga");
        System.out.println(programmer.toString());
        programmer.coding();
        System.out.println("---------------------------------");
        System.out.println(dancer.toString());
        dancer.dancing();
        System.out.println("---------------------------------");
        System.out.println(singer.toString());
        singer.singing();
        singer.playGuitar();
    }
}
