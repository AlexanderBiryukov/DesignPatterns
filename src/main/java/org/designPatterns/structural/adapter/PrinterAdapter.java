package org.designPatterns.structural.adapter;

//  Адаптер, который позволяет использовать старый принтер через интерфейс нового принтера
public class PrinterAdapter extends LPTPortPrinter implements NewPrinter{

    @Override
    public void printViaUsb(String text) {
        printViaLPT(text);
    }
}
