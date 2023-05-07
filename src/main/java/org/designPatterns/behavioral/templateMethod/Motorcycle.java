package org.designPatterns.behavioral.templateMethod;

public class Motorcycle extends Vehicle{
    @Override
    protected void startEngine() {
        System.out.println("Запуск двигателя мотоцикла..");
    }
}
