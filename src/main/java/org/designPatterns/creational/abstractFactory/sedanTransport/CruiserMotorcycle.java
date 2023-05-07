package org.designPatterns.creational.abstractFactory.sedanTransport;

import org.designPatterns.creational.abstractFactory.Motorcycle;

public class CruiserMotorcycle implements Motorcycle {
    @Override
    public void ride() {
        System.out.println("Cruiser motorcycle is rides...");
    }
}
