package org.designPatterns.structural.decorator;

public class ItalicTextDecorator extends TextDecorator{
    public ItalicTextDecorator(Writer writer) {
        super(writer);
    }

    @Override
    public void writeText(String text) {
        super.writeText("<i>" +  text + "<i>");
    }

}
