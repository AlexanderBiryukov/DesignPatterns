package org.designPatterns.structural.decorator;

public class HtmlPage {
    public static void main(String[] args) {
        Writer writer = new UnderlineTextDecorator(new ItalicTextDecorator(new BoldTextDecorator(new PlainTextWriter())));

        writer.writeText("Test text!");
    }
}
