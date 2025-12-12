package ru.aston.homework;

import ru.aston.homework.hw1.Immutable;
import ru.aston.homework.hw1.Mutable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Immutable immutable = new Immutable(new Mutable("NewMutable"));
    }
}