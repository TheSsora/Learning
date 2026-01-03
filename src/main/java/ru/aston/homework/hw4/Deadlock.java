package ru.aston.homework.hw4;

public class Deadlock {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();
    public static void main(String[] args) {
        Thread thread1 = createNewThread(resource1, resource2);
        Thread thread2 = createNewThread(resource2, resource1);

        thread1.start();
        thread2.start();
    }

    private static Thread createNewThread(Object firstResource, Object secondResource) {
        return new Thread(() -> {
            synchronized (firstResource) {
                System.out.println("Поток: Захватил " + firstResource.toString());

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Поток: Ждет " + secondResource.toString());
                synchronized (secondResource) {
                    System.out.println("Поток: Захватил resource 1 и 2");
                }
            }
        });
    }
}
