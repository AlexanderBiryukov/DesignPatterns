package org.designPatterns.behavioral.state;

public class RadioEuropaPlus implements StateRadioStation{
    @Override
    public void play() {
        System.out.println("Plays the EuropaPlus...");
    }
}
