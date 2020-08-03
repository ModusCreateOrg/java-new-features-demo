package com.moduscreate.javafeatures;

public class TextBlocks {

    public static void main(String...args) {

        String block = 
        """
            <body>
                <h1> Hello, %s </h1>
            </body>
        """;
        
        System.out.println(block);
        System.out.println("***********************");
        System.out.println(block.strip());
        System.out.println("***********************");
        System.out.printf(block + "%n", "World");

    }

}