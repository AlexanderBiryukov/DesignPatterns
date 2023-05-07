package org.designPatterns.creational.builder;

public class MargaritaPizzaBuilder extends PizzaBuilder {
    @Override
    void buildName() {
        pizza.setName("Margarita");
    }

    @Override
    void buildDough() {
        pizza.setDough(Dough.Thick);
    }

    @Override
    void buildTopping() {
        pizza.setTopping("mozzarella cheese");
    }

    @Override
    void buildSauce() {
        pizza.setSauce("tomato");
    }
}
