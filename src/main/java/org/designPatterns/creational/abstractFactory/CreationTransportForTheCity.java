package org.designPatterns.creational.abstractFactory;

import org.designPatterns.creational.abstractFactory.sedanTransport.TransportForTheCityFactory;

public class CreationTransportForTheCity {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportForTheCityFactory();
        Car car = transportFactory.getCar();
        Motorcycle motorcycle = transportFactory.getMotorcycle();
        Bike bike = transportFactory.getBike();
        car.drive();
        motorcycle.ride();
        bike.ride();
    }
}
