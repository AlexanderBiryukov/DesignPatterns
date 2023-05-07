package org.designPatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalFactoryBySpecialty("dog");
        Animal animal = animalFactory.createAnimal();
        animal.Eating();

    }

    static AnimalFactory createAnimalFactoryBySpecialty(String s) {
        if (s.equalsIgnoreCase("cat")) {
            return new CatFactory();
        } else if (s.equalsIgnoreCase("dog")) {
            return new DogFactory();
        } else {
            throw new RuntimeException(s + "is unknown animals");
        }
    }
}
