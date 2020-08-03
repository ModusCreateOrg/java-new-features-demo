package com.moduscreate.javafeatures.geometry;

public final class Circle extends Shape {

    private int size;

    public Circle(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}