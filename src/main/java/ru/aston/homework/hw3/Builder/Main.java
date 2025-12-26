package ru.aston.homework.hw3.Builder;

public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.ComputerBuilder("Intel i7", "32GB")
                .storage("1TB NVMe SSD")
                .graphicsCard("NVIDIA RTX 3080")
                .operatingSystem("Windows 11")
                .bluetooth(true)
                .build();

        System.out.println("Игровой компьютер:");
        System.out.println(gamingComputer);

        Computer officeComputer = new Computer.ComputerBuilder("Intel i3", "8GB")
                .build();

        System.out.println("\nОфисный компьютер:");
        System.out.println(officeComputer);

        Computer developerComputer = new Computer.ComputerBuilder("AMD Ryzen 5", "16GB")
                .storage("512GB SSD")
                .operatingSystem("Ubuntu 22.04")
                .bluetooth(true)
                .build();

        System.out.println("\nКомпьютер разработчика:");
        System.out.println(developerComputer);
    }
}
