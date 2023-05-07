package org.designPatterns.creational.builder;

public class Pizzeria {
    PizzaBuilder pizzaBuilder;

    public void SetBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    Pizza buildPizza() {
        pizzaBuilder.createPizza();
        pizzaBuilder.buildName();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildTopping();
        pizzaBuilder.buildSauce();

        Pizza pizza = pizzaBuilder.getPizza();

        return pizza;
    }

}
