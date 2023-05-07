package org.designPatterns.creational.prototype;

public class StartAction {
    public static void main(String[] args) {
        Book book = new Book("Java: The Complete Reference, Ninth Edition",
                        "Herbert Schildt", "Education" , 1375);

        System.out.println(book);
        System.out.println("\n===============================================\n");

        BookFactory bookFactory = new BookFactory(book);
        Book copy = bookFactory.cloneBook();
        System.out.println(copy);
    }
}
