package com.moduscreate.javafeatures;

abstract sealed class Shape permits Square, Triangle {

    abstract int getSize();

    abstract String getName();

}

final class Square extends Shape {

    private final int size;
    private final String name;

    public Square(int size, String name) {
        this.size = size;
        this.name = name;
    }

    @Override
    int getSize() {
        return size;
    }

    @Override
    String getName() {
        return name;
    }
}

final class Triangle extends Shape {

    @Override
    int getSize() {
        return 0;
    }

    @Override
    String getName() {
        return null;
    }
}

final class Circle {

    private final int size;

    public Circle(int size) {
        this.size = size;
    }

    int getSize() {
        return size;
    }

}
