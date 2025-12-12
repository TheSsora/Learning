package ru.aston.homework.hw1;

public final class Immutable {

    private final Mutable mutable;

    public Immutable(Mutable mutable){
        this.mutable = new Mutable(mutable.getName());
    }

    public Mutable getMutable(){
        return new Mutable(mutable.getName());
    }
}
