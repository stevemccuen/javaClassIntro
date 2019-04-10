package com.company;

public class Operation {
    // this is the operation class
    // used to perform various
    // Operations + - / *
    //            ++ -- %
    // a = first number ; b = second number

    // Add +
    public int add(int a, int b){
        return a + b;
    }
    // Subtract -
    public int subtract(int a , int b){
        return a - b;
    }
    // Multiply *
    public int multiply(int a , int b){
        return a * b;
    }
    // Division /
    public int divide(int a , int b){
        return a / b;
    }
    //Increment ++
    public int increment(int a){
        return a++;
    }
    // Decrement --
    public int decrement(int a){
        return a--;
    }
    // Modulus %
    public int modulus(int a , int b) {
        return a % b;
    }
    public int multadd(int a, int b, int c){
        int sum = a + b;
        return sum * c;
    }
    public String  message(String a){
        String mesg = "whats up";
        return a + mesg;
    }
}

