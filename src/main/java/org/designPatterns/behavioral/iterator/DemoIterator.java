package org.designPatterns.behavioral.iterator;

public class DemoIterator {
    public static void main(String[] args) {
        ListObj listObj = new ListObj(new String[]{"One", "Two", "Three"});

        Iterator iterator = listObj.getIterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
