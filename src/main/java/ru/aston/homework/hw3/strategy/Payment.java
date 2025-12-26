package ru.aston.homework.hw3.strategy;

public class Payment {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(Integer amount) {
        if(paymentStrategy == null) {
            throw new IllegalStateException("Стратегия оплаты не установлена");
        }
        if(amount == null) {
            throw new IllegalStateException("Сумма оплаты не определена");
        }
        paymentStrategy.pay(amount);
    }
}
