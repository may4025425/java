package com.may;


import java.util.Random;
import java.util.Scanner;

public class NumberCalling {
    public static void main(String[] args) {
        OOPNumberCalling oopNumberCalling = new OOPNumberCalling();
        System.out.println("目前號碼: " + oopNumberCalling.number);
        while (oopNumberCalling.number <= 100) {
            oopNumberCalling.add();
            System.out.println("目前號碼: " + oopNumberCalling.number);
        }
        oopNumberCalling.number = 0;

    }
}