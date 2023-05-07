package org.designPatterns.structural.facade;
// конвеер по приготовлению тортов
public class ConfectioneryFactory {
    public static void main(String[] args) {
        ProductConveyor productConveyor = new ProductConveyor();

        productConveyor.startConveyor();
    }
}
