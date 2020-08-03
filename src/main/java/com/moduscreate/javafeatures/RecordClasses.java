package com.moduscreate.javafeatures;

public class RecordClasses {
    
    public static void main(String[] args) {
        
        var person = new Person("Michael Jordan", 50);
        
        System.out.println(person.name());
        System.out.println(person.age());

        var otherPerson = new Person("Michael Jordan", 50);

        System.out.println(person.equals(otherPerson));

    }

}