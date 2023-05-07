package org.designPatterns.behavioral.templateMethod;

public abstract class Vehicle {
    public void start() {
        System.out.println("Вставьте ключ в замок зажигания и поверните его");
        startEngine();
        System.out.println("Начинаем движение!!!");
    }

    protected abstract void startEngine();

}
