package org.designPatterns.creational.abstractFactory.sportTransport;

import org.designPatterns.creational.abstractFactory.Bike;
import org.designPatterns.creational.abstractFactory.Car;
import org.designPatterns.creational.abstractFactory.Motorcycle;
import org.designPatterns.creational.abstractFactory.TransportFactory;

public class SportsTransportFactory implements TransportFactory {
    @Override
    public Car getCar() {
        return new SportCar();
    }

    @Override
    public Motorcycle getMotorcycle() {
        return new SportMotorcycle();
    }

    @Override
    public Bike getBike() {
        return new MountainBike();
    }
}
