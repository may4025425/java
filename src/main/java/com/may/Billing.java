package com.may;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Total:");
        int total = Integer.parseInt(scanner.nextLine());
        System.out.println("Need to split bill?");
        String yn = scanner.nextLine();
        if(yn.equalsIgnoreCase("y")){
            System.out.println("How many kids?");
            try{
                int n = Integer.parseInt(scanner.nextLine());
                int eachPaid = total / n;
                System.out.println(eachPaid + " for each ");
            }catch (NumberFormatException e){
                System.out.println("Hello?");
            }catch (ArithmeticException e){
                System.out.println("Hello");
            }
        }
    }
}
