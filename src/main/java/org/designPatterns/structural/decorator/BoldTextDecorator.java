package org.designPatterns.structural.decorator;

public class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Writer writer) {
        super(writer);
    }

    @Override
    public void writeText(String text) {
        super.writeText("<b>" +  text + "<b>");
    }

}
