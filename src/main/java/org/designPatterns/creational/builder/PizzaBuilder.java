package org.designPatterns.creational.builder;

public abstract class PizzaBuilder {
    Pizza pizza;
    void createPizza () {
        pizza = new Pizza();
    }

    abstract void buildName();
    abstract void buildDough ();
    abstract void buildTopping();
    abstract void buildSauce();

    public Pizza getPizza() {
        return pizza;
    }
}
