package com.company;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {

        System.out.println("Welcome to The Deadliest Word Game Ever");
        System.out.println("Utilizing Java We Made A Game That KILLS");
        playGame();


        System.out.println("Enter Secret Word - Don't Let Anyone Know");
        String secretWord = new Scanner(System.in).next();
        System.out.println("The Secret Just Lost Its Letters " +
                "The Word Needs Help Getting All Of Its Constants and Vowels ");
        System.out.println("Will You HELP? Enter Yes or No");
        String willHelp = new Scanner(System.in).next();
        if(willHelp.toLowerCase() == "yes") {
            Integer numberOfGuesses = secretWord.length();
            System.out.println("YOU Have : " + numberOfGuesses + "Guesses");
        }
        else if(willHelp.toLowerCase() == "no"){
            System.out.println("YOU DIED");
        }

    }

}
