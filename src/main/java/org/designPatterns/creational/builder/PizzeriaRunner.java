package org.designPatterns.creational.builder;

public class PizzeriaRunner {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        pizzeria.SetBuilder(new PepperoniPizzaBuilder());

        Pizza pizza = pizzeria.buildPizza();
        System.out.println(pizza);

    }
}
