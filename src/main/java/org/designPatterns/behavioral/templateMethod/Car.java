package org.designPatterns.behavioral.templateMethod;

public class Car extends Vehicle{

    @Override
    protected void startEngine() {
        System.out.println("Запуск двигателя автомобиля..");
    }
}
