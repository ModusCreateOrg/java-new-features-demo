package com.moduscreate.javafeatures.geometry;

public class SealedClasses {

    public static void main(String[] args) {

        Shape circle = new Circle(50);
        Shape square = new Square(25);
        Shape namedSquare = new NamedSquare("Mirror", 10);

        System.out.println(circle.getSize());
        System.out.println(square.getSize());
        System.out.println(namedSquare.getSize());

        ((Circle) circle).setSize(12);

        System.out.println(circle.getSize());

    }

}
