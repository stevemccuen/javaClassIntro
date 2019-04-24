package src.com.company.NewClasswork;

import java.util.Scanner;

public class Game {
    public static void main(final String[] args) {
        int numOfGuesses = 0;
        final GameHelper helper = new GameHelper();

        final SimpleDotCom theDotCom = new SimpleDotCom();
        final int randomNum = (int) (Math.random() * 5);

        final int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true)
        {
            final String guess = helper.getUserInput("enter a number");
            final String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}

