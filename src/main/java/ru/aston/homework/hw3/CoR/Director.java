package ru.aston.homework.hw3.CoR;

public class Director extends Approver{
    private final double MAX_AMOUNT = 10000;

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= MAX_AMOUNT) {
            System.out.println("Директор утвердил закупку на сумму: " + request.getAmount());
        } else if (nextApprover != null) {
            System.out.println("Директор: передаю ген. директору.");
            nextApprover.processRequest(request);
        }
    }
}
