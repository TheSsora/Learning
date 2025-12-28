package ru.aston.homework.hw3.Adapter;

public class AmericanPlug implements AmericanSocket{
    @Override
    public void plugIn() {
        System.out.println("Американская вилка подключена к розетке");
    }
}
