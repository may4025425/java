package com.may.Parking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        int spots = 0;
        Parking parking = new Parking();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Parking lot Management System!");
        parking.func();
        System.out.println("是否查看剩餘車位（Y/N）");
        String y = scanner.nextLine();
        if(y.equals("Y")){
            parking.setSpots(spots);
            System.out.println("剩餘車位: " + parking.spots);
        }
    }
}
// Car car = new Car("AAB-5566");
// Car truck = new Truck("DE-556");
//因為Truck類別繼承Car類別，故父(Car)可以使用子(Truck)
// writer.write(truck.id + "," + truck.entering + "," +truck.leaving);