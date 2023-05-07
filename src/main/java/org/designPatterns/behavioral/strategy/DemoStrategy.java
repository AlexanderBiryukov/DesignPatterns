package org.designPatterns.behavioral.strategy;
// сайт покупки билетов на транспорт
public class DemoStrategy {
    public static void main(String[] args) {
        WebsiteBuyingTransportTickets website = new WebsiteBuyingTransportTickets();

        website.setCalculation(new BusTicketsCalculate());
        website.priceCalculation();

        website.setCalculation(new TrainTicketsCalculate());
        website.priceCalculation();

        website.setCalculation(new AirPlaneTickets());
        website.priceCalculation();

    }
}
