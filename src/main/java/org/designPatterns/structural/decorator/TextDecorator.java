package org.designPatterns.structural.decorator;

public class TextDecorator implements Writer {
    Writer writer;

    public TextDecorator(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void writeText(String text) {
        writer.writeText(text);
    }
}
