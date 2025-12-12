package ru.aston.homework.hw1;

public class Mutable {

    private String name;

    public Mutable(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
