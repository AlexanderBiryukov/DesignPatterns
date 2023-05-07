package org.designPatterns.structural.facade;

public class ProductConveyor {
    Dough dough = new Dough();
    Packager packager = new Packager();

    public void startConveyor() {
        dough.bakeDough();
        dough.glazingBaking();
        if (dough.status == true) {
            packager.packaging();
            System.out.println("Продукт готов к продаже.");
        } else {
            System.out.println("Конвеер не исправен");
        }
    }
}
