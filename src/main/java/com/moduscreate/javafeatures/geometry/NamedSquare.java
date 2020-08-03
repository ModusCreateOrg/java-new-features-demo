package com.moduscreate.javafeatures.geometry;

public class NamedSquare extends Square {

    private String name;

    public NamedSquare(String name, int size) {
        super(size);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
