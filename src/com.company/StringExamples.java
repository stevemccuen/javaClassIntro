package com.company;

import java.util.Scanner;

public class StringExamples {
    // This will be a helpful tool for learning Strings
    /*
    Add any other helpful information here.
    word.charAt(eveter a number here); returns char at number
    word.concat("enter a word"); adds a word the end
    word.equals("enters a word"); compares two strings
    word.toUpperCase(); makes a word all CAPS
    word.toLowerCase(); makes all words lower case

     */
    // sout ENTER creates System.out.printIn();
    // psvm ENTER creates Public Static Void Main(String[] args);

    public static void main(String[] args){
        System.out.println("Enter A 5  Letter Word Please Or Die");
        String example;
        example = new Scanner(System.in).next();
        System.out.println(example.charAt(example.length()/2));
        System.out.println(example.equals(example));
        System.out.println(example.concat(example));
        System.out.println(example.toUpperCase());
        System.out.println(example.toLowerCase());

    }

}
