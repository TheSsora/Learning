package ru.aston.homework.hw3.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Простое уведомление ===");
        Notifier simpleNotifier = new SimpleNotifier();
        simpleNotifier.send("Привет!");

        System.out.println("\n=== Уведомление с SMS ===");
        Notifier smsNotifier = new SMSNotifierDecorator(new SimpleNotifier());
        smsNotifier.send("Сообщение с SMS!");

        System.out.println("\n=== Все типы уведомлений ===");
        Notifier allInOne = new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                            new SimpleNotifier()));
        allInOne.send("Важное сообщение всем каналам!");
    }
}
