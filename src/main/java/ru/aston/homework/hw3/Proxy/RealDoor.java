package ru.aston.homework.hw3.Proxy;

public class RealDoor implements Door{
    @Override
    public void open() {
        System.out.println("Дверь открыта!");
    }
}
