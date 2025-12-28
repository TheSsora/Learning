package ru.aston.homework.hw3.Decorator;

public class SimpleNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Отправка базового уведомления: " + message);
    }
}
