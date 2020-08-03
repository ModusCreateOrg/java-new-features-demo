package com.moduscreate.javafeatures;

public class SwitchExpressions {

    public static void main(String[] args) {
        
        switch (args[0]) {
            case "US" -> System.out.println("United States");
            case "CR" -> System.out.println("Costa Rica");
            case "RO" -> System.out.println("Romenia");
        }

        var country = switch (args[1]) {
            case "US" -> "United States";
            case "CR" -> "Costa Rica";
            case "RO" -> "Romenia";
            default -> "Not found!";
        };

        System.out.println(country);
        
        System.out.println(switch (args[2]) {
            case "US" -> "United States";
            case "CR" -> "Costa Rica";
            case "RO" -> "Romenia";
            default -> "Not found!";
        });

        System.out.println(switch (args[1]) {
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