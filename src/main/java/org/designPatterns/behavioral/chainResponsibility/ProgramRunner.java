package org.designPatterns.behavioral.chainResponsibility;
// программа для аутентификации состоящая из 3 этапов
public class ProgramRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        Handler handler1 = new UserExistsHandler(dataBase);
        Handler handler2 = new ValidPasswordHandler(dataBase);
        Handler handler3 = new RoleCheckHandler();

        handler1.setNexthandler(handler2);
        handler2.setNexthandler(handler3);

        handler1.handle("user_username", "user_password");

    }
}
