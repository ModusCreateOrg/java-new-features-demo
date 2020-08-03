package com.moduscreate.javafeatures.geometry;

public non-sealed class Square extends Shape {

    private int size;

    public Square(int size) {
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