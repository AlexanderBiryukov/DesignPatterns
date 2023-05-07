package org.designPatterns.structural.decorator;

public class UnderlineTextDecorator extends TextDecorator {

    public UnderlineTextDecorator(Writer writer) {
        super(writer);
    }

    @Override
    public void writeText(String text) {
        writer.writeText("<u>" + text + "<u>");
    }
}
