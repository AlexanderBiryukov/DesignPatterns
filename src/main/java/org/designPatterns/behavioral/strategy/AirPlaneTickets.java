package org.designPatterns.behavioral.strategy;

public class AirPlaneTickets implements Calculation{
    @Override
    public void calculate() {
        System.out.println("Расчитываем стоимость билета на самолёт...");
    }
}
