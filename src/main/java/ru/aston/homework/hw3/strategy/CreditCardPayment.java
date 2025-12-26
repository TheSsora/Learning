package ru.aston.homework.hw3.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private Integer cardNumber;

    public CreditCardPayment(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Оплата картой: " + cardNumber + "\n На сумму: " + amount);
    }
}
