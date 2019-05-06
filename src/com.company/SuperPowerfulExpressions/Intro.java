package src.com.company.SuperPowerfulExpressions;

import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
        playGame();


    }

    public static void SomethingToDo(int userInput){
        if(userInput > 0 && userInput < 30) {
            System.out.println(userInput + " Greater than zero " +
                    "but less than thirty");

        }
            if(userInput > 30){
                System.out.println(userInput +" Greater than thirty ");
        }

    }
    public static void playGame(){
        System.out.println("Number Guess Game.");
        Scanner someInput = new Scanner(System.in);
        System.out.println("Enter Your Name.");
        String userName = someInput.nextLine();
        System.out.println(userName + " You can Enter a Number at any time.");
        int userNumber = someInput.nextInt();
        System.out.println(superPowerfulEx(userName));
        someInput.close();
    }
    public static String superPowerfulEx(String name){
        return name + " Thanks for PLaying.";
    }
}
