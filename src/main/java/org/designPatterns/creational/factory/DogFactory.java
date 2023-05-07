package org.designPatterns.creational.factory;

public class DogFactory implements  AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
