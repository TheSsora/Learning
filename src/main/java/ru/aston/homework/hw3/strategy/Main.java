package ru.aston.homework.hw3.strategy;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.setPaymentStrategy(new CashPayment());
        payment.checkout(500);

        payment.setPaymentStrategy(new CreditCardPayment(123321));
        payment.checkout(1500);

        payment.setPaymentStrategy(new SBPPayment("+70009991122"));
        payment.checkout(3000);
    }
}
