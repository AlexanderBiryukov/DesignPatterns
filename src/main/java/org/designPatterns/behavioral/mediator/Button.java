package org.designPatterns.behavioral.mediator;

public class Button {
    private Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public void press() {
        mediator.press();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Button() {
    }

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }
}
