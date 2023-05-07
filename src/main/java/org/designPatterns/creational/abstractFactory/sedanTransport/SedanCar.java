package org.designPatterns.creational.abstractFactory.sedanTransport;

import org.designPatterns.creational.abstractFactory.Car;

public class SedanCar implements Car {
    @Override
    public void drive() {
        System.out.println("Sedan car is driving...");
    }
}
