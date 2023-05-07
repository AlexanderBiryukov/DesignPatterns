package org.designPatterns.structural.proxy;

public class DataBaseImpl implements DataBase{
    private String url;
    private User user;

    public DataBaseImpl(String url, User user) {
        this.url = url;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public void query() {
        System.out.println("Выполняется запрос к базе данных URl: \n" + url);
    }
}
