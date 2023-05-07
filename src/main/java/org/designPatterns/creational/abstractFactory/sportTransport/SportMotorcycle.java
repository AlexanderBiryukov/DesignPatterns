package org.designPatterns.creational.abstractFactory.sportTransport;

import org.designPatterns.creational.abstractFactory.Motorcycle;

public class SportMotorcycle implements Motorcycle {
    @Override
    public void ride() {
        System.out.println("Sport motorcycle is rides...");
    }
}
