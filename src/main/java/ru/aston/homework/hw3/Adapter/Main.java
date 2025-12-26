package ru.aston.homework.hw3.Adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пример 1: Американская вилка");
        AmericanSocket americanPlug = new AmericanPlug();
        connectToAmericanSocket(americanPlug);

        System.out.println("\nПример 2: Европейская вилка с адаптером");
        EuropeanPlug europeanPlug = new EuropeanPlug();
        AmericanSocket adapter = new EuropeanToAmericanAdapter(europeanPlug);
        connectToAmericanSocket(adapter);
    }

    public static void connectToAmericanSocket(AmericanSocket socket) {
        socket.plugIn();
    }
}
