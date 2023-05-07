package org.designPatterns.creational.abstractFactory.sportTransport;

import org.designPatterns.creational.abstractFactory.Car;

public class SportCar implements Car {
    @Override
    public void drive() {
        System.out.println("Sport car is driving...");
    }
}
