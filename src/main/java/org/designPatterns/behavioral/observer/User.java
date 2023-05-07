package org.designPatterns.behavioral.observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void subscribeTo(SocialNetwork socialNetwork) {
        socialNetwork.subscribe(this);
    }

    public void unsubscribeFrom(SocialNetwork socialNetwork) {
        socialNetwork.unsubscribe(this);
    }

    @Override
    public void update(Post post) {
        System.out.println("Пользователь " + name + " получил новый пост: " + post.getContent());
    }
}
