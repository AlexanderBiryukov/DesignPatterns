package org.designPatterns.behavioral.observer;

public class DemoObserver {
    public static void main(String[] args) {
        User user1 = new User("Mark");
        User user2 = new User("Kirill");

        SocialNetwork socialNetwork = new SocialNetwork();
        user1.subscribeTo(socialNetwork);
        user2.subscribeTo(socialNetwork);

        socialNetwork.publish(new Post("Hello, world!"));

    }
}
