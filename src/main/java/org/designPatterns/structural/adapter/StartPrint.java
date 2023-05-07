package org.designPatterns.structural.adapter;

public class StartPrint {
    public static void main(String[] args) {

        NewPrinter newPrinter = new UsbPrinter();

        // Печать через новый принтер
        newPrinter.printViaUsb("Test print");

        // Создаем адаптер, который позволяет использовать старый принтер через интерфейс нового принтера
        PrinterAdapter adapter = new PrinterAdapter();

        // Напечатаем через адаптер, который использует старый принтер через LPT порт
        adapter.printViaUsb("Test print");

    }
}
