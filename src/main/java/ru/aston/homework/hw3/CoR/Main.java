package ru.aston.homework.hw3.CoR;

public class Main {
    public static void main(String[] args) {
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        PurchaseRequest smallPurchase = new PurchaseRequest(500, "Канцелярия");
        PurchaseRequest mediumPurchase = new PurchaseRequest(5000, "Ноутбук");
        PurchaseRequest largePurchase = new PurchaseRequest(50000, "Сервер");

        System.out.println("--- Запрос на 500 руб ---");
        manager.processRequest(smallPurchase);

        System.out.println("\n--- Запрос на 5000 руб ---");
        manager.processRequest(mediumPurchase);

        System.out.println("\n--- Запрос на 50000 руб ---");
        manager.processRequest(largePurchase);
    }
}
