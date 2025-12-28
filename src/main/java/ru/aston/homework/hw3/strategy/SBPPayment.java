package ru.aston.homework.hw3.strategy;

public class SBPPayment implements PaymentStrategy{
    private String phoneNumber;

    public SBPPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата с номера телефона: " + phoneNumber + "\n На сумму: " + amount);
    }
}
