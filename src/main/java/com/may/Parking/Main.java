package com.may.Parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_SPOTS = 20;
        final int CAR_ENTERING = 1;
        final int CAR_LEAVING = 2;
        final int STATUS = 3;
        List<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int fee = 30;
        System.out.println("1) Car entering");
        System.out.println("2) Car leaving");
        System.out.println("3) Status");
        int fun = scanner.nextInt();
        switch (fun) {
            case CAR_ENTERING:
                break;
            case CAR_LEAVING:
                break;
            case STATUS:
                break;

        }
    }
}
