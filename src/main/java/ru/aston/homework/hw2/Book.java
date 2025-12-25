package ru.aston.homework.hw2;

public class Book {
    private String title;
    private Integer pagesCount;
    private Integer manufactureYear;

    public Book(String title, Integer pagesCount, Integer manufactureYear){
        this.title = title;
        this.pagesCount = pagesCount;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public String toString() {
        return  "\nНазвание: '" + title + "'"
                + ", Год написания: " + manufactureYear +
                ", Страниц: " + pagesCount;
    }

    public int getPages() {return pagesCount;}
    public int getYear() {return manufactureYear;}
    public String getTitle() {return  title;}
}
