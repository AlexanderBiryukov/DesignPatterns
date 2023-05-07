package org.designPatterns.behavioral.chainResponsibility;

import java.util.HashMap;

public class DataBase {
    private final HashMap<String, String> users;

    public DataBase() {
        users = new HashMap<>();
        users.put("admin_username", "admin_password");
        users.put("user_username", "user_password");
    }

    public boolean isValidUser(String name) {
        return users.containsKey(name);
    }

    public boolean isValidPassword(String name, String password) {
        return users.get(name).equals(password);
    }

}
