package org.designPatterns.behavioral.templateMethod;
// Имитируем начало поездки на каком либо транпорте
public class DemoTemplateMethod {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();

        System.out.println();

        motorcycle.start();
    }
}
