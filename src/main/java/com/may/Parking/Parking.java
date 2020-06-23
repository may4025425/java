package com.may.Parking;


import java.io.*;
import java.util.*;

public class Parking {
    final int MAX_SPOTS = 20;
    long entering;
    String carid;
    int spots;
    int choice;
    int fee = 30;
    Scanner scanner = new Scanner(System.in);
    File saveFile = new File("停車紀錄.txt");
    List<Car> cars = new ArrayList<>();

    public Parking() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(saveFile));
            carid = br.readLine();
            spots = Integer.parseInt(br.readLine());
            entering = Long.parseLong(br.readLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }


    public void setSaveFile(int fee) {
        this.fee = fee;
        FileWriter writer = null;
        try {
            writer = new FileWriter(saveFile,true);
            writer.write(String.valueOf(this.fee) +'\n');
            writer.write(carid+"\n");
            writer.write(entering+"\n");
            writer.write(spots+"\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setSpots(int spots){
        this.spots = spots;

    }

    public void func(){
        while (choice != 4) {
            System.out.println("1) Car entering");
            System.out.println("2) Car leaving");
            System.out.println("3) Status");
            System.out.println("4) Exit");
            String s =scanner.nextLine();
            choice =  Integer.parseInt(s);
            switch (choice) {
                case 1:
                    System.out.println("Please enter Car ID:");
                    String carid = scanner.nextLine();
                    Car c = new Car(carid);
                    cars.add(c);
                    System.out.println("Car added");
                    spots = MAX_SPOTS -1;
                    break;
                case 2:
                    System.out.println("Please enter Car ID:");
                    String leaveId = scanner.nextLine();
                    try{
                        for (Car car : cars) {
                            if (car.id.equals(leaveId)) {
                                long now = System.currentTimeMillis();
                                long duration = now - car.entering;
                                System.out.println(duration/1000/3600 + "hr");
                                System.out.println(duration/1000/3600*fee+"元");
                                cars.remove(car);
                                setSaveFile(fee);
                                spots = MAX_SPOTS +1;
                            }
                        }
                    }catch (ConcurrentModificationException e){
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    for (Car car : cars) {
                        System.out.println(car.id + "/" + car.entering + "/" + car.leaving);
                    }
                    break;
            }
        }
        System.out.println("～歡迎再度光臨～");
    }

}
