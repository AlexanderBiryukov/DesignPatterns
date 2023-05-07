package org.designPatterns.behavioral.state;

public class RadioRecord implements StateRadioStation{
    @Override
    public void play() {
        System.out.println("Plays the RadioRecord...");
    }
}
