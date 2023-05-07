package org.designPatterns.behavioral.state;

public class RadioReceiver {
    StateRadioStation radioStation;

    public void setRadioStation(StateRadioStation radioStation) {
        this.radioStation = radioStation;
    }

    public void nextStation() {
        if(radioStation instanceof RadioRecord) {
            setRadioStation(new RadioEuropaPlus());
        } else if(radioStation instanceof  RadioEuropaPlus) {
            setRadioStation(new RadioEnergy());
        } else if(radioStation instanceof RadioEnergy) {
            setRadioStation(new RadioRecord());
        }
    }
    public void play() {
        radioStation.play();
    }

}
