package org.designPatterns.creational.abstractFactory;

import org.designPatterns.creational.abstractFactory.sportTransport.SportsTransportFactory;

public class CreateSportTransport {
    public static void main(String[] args) {
        TransportFactory transportFactory = new SportsTransportFactory();
        Car car = transportFactory.getCar();
        Motorcycle motorcycle = transportFactory.getMotorcycle();
        Bike bike = transportFactory.getBike();
        car.drive();
        motorcycle.ride();
        bike.ride();

    }
}
