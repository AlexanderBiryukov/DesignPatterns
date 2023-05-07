package org.designPatterns.structural.adapter;

public class UsbPrinter implements NewPrinter{
    @Override
    public void printViaUsb(String text) {
        System.out.println("Printing via USB port: \n" + text);
    }
}
