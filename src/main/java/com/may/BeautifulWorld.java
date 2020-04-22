package com.may;

import java.util.Scanner;

public class BeautifulWorld {
    public static void main(String[] args) {
        PiggyBank piggy = new PiggyBank();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        System.out.println("Total: " + piggy.total);
        System.out.println("Please put your coin?");
        while (n != -1) {
            n = scanner.nextInt();
            switch (n) {
                case 1:
                case 5:
                case 10:
                    piggy.add(n);
                    break;
                default:
            }
            System.out.println("Total: " + piggy.total);
            piggy.showCoins();
        }
    }
}

