package org.designPatterns.creational.abstractFactory.sedanTransport;

import org.designPatterns.creational.abstractFactory.Bike;
import org.designPatterns.creational.abstractFactory.Car;
import org.designPatterns.creational.abstractFactory.Motorcycle;
import org.designPatterns.creational.abstractFactory.TransportFactory;

public class TransportForTheCityFactory implements TransportFactory {
    @Override
    public Car getCar() {
        return new SedanCar();
    }

    @Override
    public Motorcycle getMotorcycle() {
        return new CruiserMotorcycle();
    }

    @Override
    public Bike getBike() {
        return new RoadBike();
    }
}
