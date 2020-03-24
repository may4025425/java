package com.may;

import java.util.Scanner;

public class Hello2 {
    public static void main(String[] args) {
        System.out.println("Please enter your age!");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        int num = Integer.parseInt(s);
        System.out.println(s);
        try {
            int age = Integer.parseInt(s);
            System.out.println(Math.sqrt(age*10));
        }catch (NumberFormatException e){
            //System.out.println("error");
            //e.printStackTrace();
        }
    }
}
