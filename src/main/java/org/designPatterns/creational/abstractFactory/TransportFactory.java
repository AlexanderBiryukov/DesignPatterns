package org.designPatterns.creational.abstractFactory;

public interface TransportFactory {
    Car getCar();

    Motorcycle getMotorcycle();

    Bike getBike();

}
