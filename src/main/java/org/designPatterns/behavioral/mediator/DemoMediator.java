package org.designPatterns.behavioral.mediator;

public class DemoMediator {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Button button = new Button(mediator);
        Fan fan = new Fan(mediator);

        mediator.setButton(button);
        mediator.setFan(fan);
        mediator.setPowerSupplier(new PowerSupplier());

        mediator.start();
        mediator.stop();

    }
}
