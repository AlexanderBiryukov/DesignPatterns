package org.designPatterns.creational.abstractFactory.sportTransport;

import org.designPatterns.creational.abstractFactory.Bike;

public class MountainBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Mountain bike is rides...");
    }
}
