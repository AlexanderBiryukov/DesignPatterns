package org.designPatterns.behavioral.strategy;

public class WebsiteBuyingTransportTickets {
    Calculation calculation;

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public void priceCalculation() {
        calculation.calculate();
    }
}
