package ru.aston.homework.hw3.Proxy;

public class SecurityProxy implements Door{
    private RealDoor realDoor;
    private String password;

    public SecurityProxy(String password) {
        this.password = password;
    }

    @Override
    public void open() {
        if (checkAccess()) {
            if (realDoor == null) {
                realDoor = new RealDoor();
            }
            realDoor.open();
        } else {
            System.out.println("Доступ запрещен! Неверный пароль.");
        }
    }

    private boolean checkAccess() {
        return "1234".equals(password);
    }
}
