package org.designPatterns.behavioral.command;

public class User {
    Command start;
    Command reset;
    Command stop;

    public User(Command start, Command reset, Command stop) {
        this.start = start;
        this.reset = reset;
        this.stop = stop;
    }

    public void startComputer(){
        start.execute();
    }
    public void stopComputer(){
        stop.execute();
    }
    public void resetComputer() {
        reset.execute();
    }


}
