package com.may;

import java.util.Scanner;

public class BeautifulWorld {
    public static void main(String[] args) {
        PiggyBank piggy = new PiggyBank();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total: " + piggy.total);
        System.out.println("Please put your coin?");
        int n = 0;
        while (n != -1) {
            n = scanner.nextInt(); //為何要用回圈？要讓他重複執行啊！
            piggy.add(n);
            System.out.println("Total: " + piggy.total);
            piggy.showCoins();
        }
    }
}

