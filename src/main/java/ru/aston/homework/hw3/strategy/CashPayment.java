package ru.aston.homework.hw3.strategy;

public class CashPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Оплата наличными\n На сумму: " + amount);
    }
}
