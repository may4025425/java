package com.may.Parking;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MAX_SPOTS = 20;
        final int CAR_ENTERING = 1;
        final int CAR_LEAVING = 2;
        final int STATUS = 3;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        List<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int fee = 30;
        System.out.println("1) Car entering");
        System.out.println("2) Car leaving");
        System.out.println("3) Status");
        int fun = scanner.nextInt();
        switch (fun) {
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
                        System.out.println(duration + "ms");
                        System.out.println(duration * fee);
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
