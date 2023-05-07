package org.designPatterns.structural.proxy;

public class DemoDataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DataBaseProxy(
                new DataBaseImpl("jdbc:postgresql://localhost:5432/postgres",new User("Alex", "admin")));
        dataBase.query();

    }
}
