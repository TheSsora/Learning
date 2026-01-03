package ru.aston.homework.hw4;

import java.util.HashMap;

public class Infinity {
    private static boolean firstTurn = true;

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                if (firstTurn) {
                    synchronized (Infinity.class) {
                        if (firstTurn) {
                            System.out.println("1");
                            firstTurn = false;
                        }
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                if (!firstTurn) {
                    synchronized (Infinity.class) {
                        if (!firstTurn) {
                            System.out.println("2");
                            firstTurn = true;
                        }
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
