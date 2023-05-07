package org.designPatterns.creational.builder;

public class PepperoniPizzaBuilder extends PizzaBuilder {

    @Override
    void buildName() {
        pizza.setName("Pepperoni");
    }

    @Override
    void buildDough() {
        pizza.setDough(Dough.Thin);
    }

    @Override
    void buildTopping() {
        pizza.setTopping("pepperoni");
    }

    @Override
    void buildSauce() {
        pizza.setSauce("tomato");
    }
}
