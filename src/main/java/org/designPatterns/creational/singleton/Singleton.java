package org.designPatterns.creational.singleton;

public class Singleton {
    private static Singleton singletonInstance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    public void doSomeThing() {
        System.out.println("some action...");
    }

}

class Test {
    public static void main(String[] args) {
        Singleton.getInstance().doSomeThing();
    }
}
