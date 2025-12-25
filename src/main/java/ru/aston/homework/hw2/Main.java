package ru.aston.homework.hw2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Student> students = readStudentsFromFile("src/main/java/ru/aston/homework/hw2/StudentsData.txt");
        getStudentsData(students);
    }

    public static void getStudentsData(List<Student> students){

        students.stream()
                .peek(System.out::println)
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("\nГод выпуска найденной книги: " + year),
                        () -> System.out.println("\nКнига после 2000 года не найдена")
                );

    }

    public static List<Student> readStudentsFromFile(String filePath){
        List<Student> students = new ArrayList<>();
        try{
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            Student currentStudent = null;
            boolean readingBooks = false;

            for (String line : lines) {
                line = line.trim();

                if (line.equals("STUDENT_START")) {
                    currentStudent = null;
                    readingBooks = false;
                }
                else if (line.startsWith("STUDENT_END")) {
                    if (currentStudent != null) {
                        students.add(currentStudent);
                        currentStudent = null;
                    }
                    readingBooks = false;
                }
                else if (line.equals("BOOKS_START")) {
                    readingBooks = true;
                }
                else if (line.equals("BOOKS_END")) {
                    readingBooks = false;
                }
                else if (currentStudent == null && !line.isEmpty() && !readingBooks && line.contains(";")) {
                    String[] nameParts = line.split(";");
                    if (nameParts.length >= 2) {
                        currentStudent = new Student(nameParts[0].trim(), nameParts[1].trim());
                    }
                }
                else if (currentStudent != null && readingBooks && !line.isEmpty() && line.contains(";")) {
                    String[] bookParts = line.split(";");
                    if (bookParts.length == 3) {
                        try {
                            String title = bookParts[0].trim();
                            int year = Integer.parseInt(bookParts[1].trim());
                            int pages = Integer.parseInt(bookParts[2].trim());
                            currentStudent.addBook(new Book(title, pages, year));
                        } catch (NumberFormatException e) {
                            System.err.println("Ошибка парсинга данных книги: " + line);
                        }
                    }
                }
            }
            return students;
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
