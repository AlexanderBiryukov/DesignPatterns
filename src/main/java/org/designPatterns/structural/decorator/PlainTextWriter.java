package org.designPatterns.structural.decorator;

public class PlainTextWriter implements Writer {
    @Override
    public void writeText(String text) {
        System.out.println(text);
    }
}
