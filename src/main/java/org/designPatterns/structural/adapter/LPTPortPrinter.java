package org.designPatterns.structural.adapter;

public class LPTPortPrinter implements OldPrinter{
    @Override
    public void printViaLPT(String text) {
        System.out.println("Printing via LPT port: \n" + text);
    }
}
