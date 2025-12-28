package ru.aston.homework.hw3.CoR;

public class Manager extends Approver {
    private final double MAX_AMOUNT = 1000;

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= MAX_AMOUNT) {
            System.out.println("Менеджер утвердил закупку на сумму: " + request.getAmount());
        } else if (nextApprover != null) {
            System.out.println("Менеджер: сумма слишком большая, передаю директору.");
            nextApprover.processRequest(request);
        }
    }
}
