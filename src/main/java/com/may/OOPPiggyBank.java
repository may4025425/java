package com.may;

import java.util.Scanner;

public class OOPPiggyBank {
    public static void main(String[] args) {
        PiggyBank piggyBank = new PiggyBank();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Total: " + piggyBank.total);
        System.out.println("Please put your coin?");
        while (n != -1){
            n = scanner.nextInt();
            switch (n){
                case 1:
                case 5:
                case 10:
                    piggyBank.add(n);
                    break;
                default:
            }
            System.out.println("Total: " + piggyBank.total);
            piggyBank.showCoins();
        }
    }
}