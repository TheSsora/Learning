package ru.aston.homework.hw3.Proxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Попытка открыть дверь с неправильным паролем:");
        Door door1 = new SecurityProxy("wrong");
        door1.open();

        System.out.println("\nПопытка открыть дверь с правильным паролем:");
        Door door2 = new SecurityProxy("1234");
        door2.open();
    }
}
