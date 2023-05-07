package org.designPatterns.behavioral.state;

public class RadioReceiverRunner {
    public static void main(String[] args) {
        RadioReceiver radioReceiver = new RadioReceiver(); // создаём радиоприёмник
        radioReceiver.setRadioStation(new RadioRecord()); // выбираем станцию

        radioReceiver.play();  // включаем приёмник

        radioReceiver.nextStation(); // включаем следующую радио станцию

        radioReceiver.play(); // играет следующая радио станция

    }
}
