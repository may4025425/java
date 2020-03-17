package com.may;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Please enter your age!");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num = Integer.parseInt(s);
        System.out.println(Math.sqrt(num));

    }
}
