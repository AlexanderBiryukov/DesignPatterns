package org.designPatterns.behavioral.chainResponsibility;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean handle(String name, String password) {
        if ("admin_username".equals(name)) {
            System.out.println("Загрузка страницы Администратора...");
            return true;
        }
        System.out.println("Загрузка страницы по умолчанию...");
        return handleNext(name, password);
    }
}
