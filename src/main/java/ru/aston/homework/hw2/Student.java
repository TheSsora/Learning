package ru.aston.homework.hw2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Student {

    private String name;
    private String secondName;
    private List<Book> books;

    public Student(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book newBook){
        books.add(newBook);
    }

    @Override
    public String toString() {
        return "\nСтдуент: "
                + name + " "
                + secondName +
                "\nКниги:\n" + books;
    }

    public List<Book> getBooks() { return books; }
    public String getName(){return name;}
    public String getSecondName(){return secondName;}
}
