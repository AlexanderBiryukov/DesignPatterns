package org.designPatterns.structural.facade;

import org.designPatterns.creational.prototype.Book;

public class Dough {
    Boolean status;

    public void bakeDough() {
        System.out.println("Испекли тесто.");
    }

    public void glazingBaking() {
        System.out.println("Добавили глазурь.");
        status = true;
    }
}
