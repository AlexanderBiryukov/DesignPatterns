package org.designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<Post> posts = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void publish(Post post) {
        posts.add(post);
        notifyObservers(post);
    }

    private void notifyObservers(Post post) {
        for (Observer observer : observers) {
            observer.update(post);
        }

    }
}
