package org.designPatterns.behavioral.chainResponsibility;

public class ValidPasswordHandler extends Handler {
    DataBase dataBase;

    public ValidPasswordHandler(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public boolean handle(String name, String password) {
        if (!dataBase.isValidPassword(name, password)) {
            System.out.println("Неверный пароль!");
            return false;
        }
        System.out.println("Верный пароль!");
        return handleNext(name, password);
    }
}
