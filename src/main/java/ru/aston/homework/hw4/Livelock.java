package ru.aston.homework.hw4;

public class Livelock {
    private static boolean workCompleted = false;

    public static void main(String[] args) {
        final Object lock = new Object();

        Thread thread1 = createNewThread(lock, "Поток 1");
        Thread thread2 = createNewThread(lock, "Поток 2");

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        workCompleted = true;
    }

    private static Thread createNewThread(Object lock, String threadName) {
        return new Thread(() -> {
            while (!workCompleted) {
                synchronized (lock) {
                    System.out.println(threadName + ": Проверяю, нужно ли работать...");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(threadName + ": Передаю работу другому потоку");
                }

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
