package com.company;

public class MakingWaves {
    public static void main(String[] args) {
        Operation whiteWash = new Operation();
        System.out.println(whiteWash.add(40,70));
        System.out.println(whiteWash.multiply(37,9));
        System.out.println(whiteWash.subtract(whiteWash.add(40,88),whiteWash.divide(45, 9789)));
        System.out.println(whiteWash.modulus(30, 750));
        System.out.println(whiteWash.divide(30,750));
        System.out.println(whiteWash.multadd(10,7,3));
        System.out.println();
    }
}
