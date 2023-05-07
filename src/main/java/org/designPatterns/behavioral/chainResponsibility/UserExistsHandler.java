package org.designPatterns.behavioral.chainResponsibility;

public class UserExistsHandler extends Handler{
    DataBase dataBase;

    public UserExistsHandler(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public boolean handle(String name, String password) {
        if(!dataBase.isValidUser(name)) {
            System.out.println("Такой пользователь не зарегестрирован!");
            System.out.println("Зарегестрируйтесь в нашем приложении сейчас!");
            return false;
        }
        System.out.println("Пользователь найден!");
        return handleNext(name, password);
    }
}
