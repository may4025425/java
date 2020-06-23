package com.may.Parking;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int MAX_SPOTS = 20;
        final int CAR_ENTERING = 1;
        final int CAR_LEAVING = 2;
        final int STATUS = 3;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        List<Car> cars = new ArrayList<>();
        System.out.println("Welcome to Parking lot Management System!");
        Scanner scanner = new Scanner(System.in);
        int fee = 30;
        int func = 0;

        while (func != 4) {
            System.out.println("1) Car entering");
            System.out.println("2) Car leaving");
            System.out.println("3) Status");
            System.out.println("4) Exit");
            String s = scanner.nextLine();
            func = Integer.parseInt(s);
            //26、27關鍵兩行
            switch (func) {
                case CAR_ENTERING:
                    System.out.println("Please enter Car ID:");
                    String id = scanner.nextLine();
                    Car c = new Car(id);
                    cars.add(c);
                    System.out.println("Car added");
                    break;
                case CAR_LEAVING:
                    System.out.println("Please enter Car ID:");
                    String leaveId = scanner.nextLine();
                    for (Car car : cars) {
                        if (car.id.equals(leaveId)) {
                            long now = System.currentTimeMillis();
                            long duration = now - car.entering;
                            System.out.println(duration / 1000 / 3600 + "hr");
                            System.out.println(duration / 1000 / 3600 * fee + "元");
                            cars.remove(car);
                        }
                    }
                    break;
                case STATUS:
                    for (Car car : cars) {
                        Date date = new Date(car.entering);
                        System.out.println(car.id + "/" + sdf.format(date) + "/" + car.leaving);
                        // System.out.println(car.id + "/" + car.entering + "/" + car.leaving);
                    }
                    break;
            }
        }
    }
}
/* 產生亂數： 1~n
1.Random random = new Random();
  int r = random.nextInt(42)+1;
  （產生1~42的亂數)
2.int r = (int) (Math.random()*100+1);
 */