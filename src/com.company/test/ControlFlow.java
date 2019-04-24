package src.com.company.test;

import src.com.company.Operation;

public class ControlFlow {
    public static void main(final String[] args) {
        final String word1 = "whats up";
        final String word2 = "laters";
        int number1 = 26;

        // if - if else control flow statements

        if (word1 == word1){
            System.out.println(word2);
        }
        else if (word1 == word2){
            System.out.println("They are equal");
        }
        else {
            System.out.println(number1);
        }

        if (number1 == number1){
            number1 --;
            System.out.println(number1);
        }
        if (word1.length() <= number1){
            System.out.println("lets play a game");
        }
        final Operation doMath = new Operation();
        System.out.println(doMath.add(number1,4));
        System.out.println(doMath.message("Hmmm"));
        System.out.println(doMath.subtract(number1,15));
        System.out.println(doMath.multiply(number1,12));
        System.out.println(doMath.divide(number1,2));
        System.out.println(doMath.multadd(number1,4,5));
        System.out.println(doMath.modulus(number1,45));
        System.out.println(doMath.increment(number1));
        System.out.println(doMath.decrement(number1));
    }
}

