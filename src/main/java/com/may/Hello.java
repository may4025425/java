package com.may;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Please enter your age!");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        int num = Integer.parseInt(s);
//        System.out.println(Math.sqrt(num));
        boolean valid = true;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                valid = false;
            }
        }
        if(valid){
            int age = Integer.parseInt(s);
            System.out.println(Math.sqrt(age*10));
        }else{
            System.out.println("error");
        }
    }
}
