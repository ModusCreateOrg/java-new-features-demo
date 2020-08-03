package com.moduscreate.javafeatures;

public class InstanceOfPatternMatching {

    public static void main(String...args) {
        
        Object text = "Hello, %s!";

        if (text instanceof String message) {
            System.out.println(message.formatted("World"));
        }

    }

}