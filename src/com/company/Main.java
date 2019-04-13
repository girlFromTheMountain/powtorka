package com.company;

import pl.academy.code.Contry;
import pl.academy.code.pakiet.Car;

public class Main {
    public static void main(String[] args) {
        Car carTurbo = new Car();
        carTurbo.setEngine(carTurbo.new Engine());

        Contry polandia=Contry.POLAND;
        System.out.println(polandia.getCurrency());
    }
}