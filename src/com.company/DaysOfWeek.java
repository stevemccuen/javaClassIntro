package src.com.company;

import java.util.Scanner;

public class DaysOfWeek {
    /* using the string class and the switch statement
    i will create a Days OF Week Converter
    from the numbered day to the actual Day Of the Week
     */
    public static void main(String[] args) {
        daysOfWeekConverter();

    }

    static void daysOfWeekConverter(){


        System.out.println("Enter only one number 1-7");
        System.out.println("Ill tell you the Week Day");
        System.out.println("Some days have games installed");
        // Grabbing Input From User For Week Day Number
        int weekDay = new Scanner(System.in).nextInt();
        // utilizing switch statement to handle multiple outputs
        //WordGame wg = new WordGame();
        playGame wg = new WordGame();

        switch(weekDay){
            case 1: {
                String m = "Monday";
                System.out.println(m);
            }
            break;
            case 2: {
                String tu = "Tuesday";
                System.out.println(tu);
            }
            break;
            case 3: {
                String w = "Wednesday";
                System.out.println(w);
            }
            break;
            case 4: {
                String th = "Thursday";
                System.out.println(th);
            }
            break;
            case 5: {
                String f = "Friday";
                System.out.println(f);
               wg.playGame();

            }
            break;
            case 6: {
                String sa = "Saturday";
                System.out.println(sa);
            }
            break;
            case 7: {
                String su = "Sunday";
                System.out.println(su);
            }
            break;
        }


    }
}
