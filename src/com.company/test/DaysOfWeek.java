package src.com.company.test;

import src.com.company.WordGame;

import java.util.Scanner;

public class DaysOfWeek {
    /* using the string class and the switch statement
    i will create a Days OF Week Converter
    from the numbered day to the actual Day Of the Week
     */
    public static void main(final String[] args) {
        DaysOfWeek.daysOfWeekConverter();

    }

    static void daysOfWeekConverter(){


        System.out.println("Enter only one number 1-7");
        System.out.println("Ill tell you the Week Day");
        System.out.println("Some days have games installed");
        // Grabbing Input From User For Week Day Number
        final int weekDay = new Scanner(System.in).nextInt();
        // utilizing switch statement to handle multiple outputs
        //WordGame wg = new WordGame();
        final WordGame wg = new WordGame();

        switch(weekDay){
            case 1: {
                final String m = "Monday";
                System.out.println(m);
            }
            break;
            case 2: {
                final String tu = "Tuesday";
                System.out.println(tu);
            }
            break;
            case 3: {
                final String w = "Wednesday";
                System.out.println(w);
            }
            break;
            case 4: {
                final String th = "Thursday";
                System.out.println(th);
            }
            break;
            case 5: {
                final String f = "Friday";
                System.out.println(f);


            }
            break;
            case 6: {
                final String sa = "Saturday";
                System.out.println(sa);
            }
            break;
            case 7: {
                final String su = "Sunday";
                System.out.println(su);
            }
            break;
        }


    }
}
