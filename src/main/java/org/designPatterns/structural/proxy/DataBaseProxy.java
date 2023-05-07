package org.designPatterns.structural.proxy;

public class DataBaseProxy implements DataBase {
    private DataBaseImpl dataBase;

    public DataBaseProxy(DataBaseImpl dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void query() {
        System.out.println("Проверка прав доступа..");
        if (checkAccess()) {
            System.out.println("Доступ разрешен.");
            dataBase.query();
        } else {
            System.out.println("Доступ запрещен!");
        }
    }

    private boolean checkAccess() {
        return dataBase.getUser().getRole().equals("admin");

    }
}
