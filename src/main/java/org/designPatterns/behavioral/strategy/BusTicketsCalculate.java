package org.designPatterns.behavioral.strategy;

public class BusTicketsCalculate implements Calculation{
    @Override
    public void calculate() {
        System.out.println("Расчитываем стоимость билета на автобус...");
    }
}
