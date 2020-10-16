package com.moduscreate.javafeatures;

import java.util.Scanner;

public class SwitchExpressions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Type a country initials: ");

        var countryInitials = sc.nextLine();

        switch (countryInitials) {
            case "US" -> System.out.println("United States");
            case "CR" -> System.out.println("Costa Rica");
            case "RO" -> System.out.println("Romenia");
        }

        var country = switch (countryInitials) {
            case "US" -> "United States";
            case "CR" -> "Costa Rica";
            case "RO" -> "Romenia";
            default -> "Not found!";
        };

        System.out.println(country);

        System.out.println(switch (countryInitials) {
            case "US" -> {
                System.out.println("Might be United States");
                yield "Yeah, it is United States";
            }   
            case "CR" -> "Costa Rica";
            case "RO" -> "Romenia";
            default -> "Not found!";
        });

    }

}