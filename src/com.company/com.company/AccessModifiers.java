package com.company;

public class AccessModifiers {
    public static void main(String[] args) {
        // Calling all methods
        saySomthingNice();
        secretWord();
        DefaultExample obj = new DefaultExample();
        obj.display();
    }
    static void saySomthingNice(){
        String steve = "hello mike";
        System.out.println(steve);
    }
    static void secretWord(){
        String arcade = "hello Game";
        String a = arcade.substring(4,8);
        String b = arcade.substring(7);
        String c = b + arcade + a;
        System.out.println(c);
    }
}
