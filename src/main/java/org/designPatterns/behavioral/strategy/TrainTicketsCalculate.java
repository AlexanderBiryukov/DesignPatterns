package org.designPatterns.behavioral.strategy;

public class TrainTicketsCalculate implements Calculation{
    @Override
    public void calculate() {
        System.out.println("Расчитываем стоимость билета на поезд...");
    }
}
