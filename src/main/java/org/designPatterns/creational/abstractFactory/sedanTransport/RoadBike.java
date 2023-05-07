package org.designPatterns.creational.abstractFactory.sedanTransport;

import org.designPatterns.creational.abstractFactory.Bike;

public class RoadBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Road bike is rides...");
    }
}
