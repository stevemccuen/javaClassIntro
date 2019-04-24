package src.com.company;

import java.util.Scanner;

public class StringConCat {

    public static void main(final String[] args) {
        System.out.println("Enter the word you want to change");
        final String userInput = new Scanner(System.in).next();
        final String name = "skadoosh";
        final String newWord;
        newWord = userInput.concat(name.substring(0, 3));
        final String bread = name.substring(3);
        System.out.println(bread + newWord);
    }
}