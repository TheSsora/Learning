package ru.aston.homework.hw3.CoR;

public class CEO extends Approver{
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("Генеральный директор утвердил закупку на сумму: " + request.getAmount());
    }
}
