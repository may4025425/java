package com.may.Parking;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Testing {
    public static void main(String[] args) {
        File saveFile = new File("20200609.txt");
        FileWriter writer;
        try {
            writer = new FileWriter(saveFile,true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Car car = new Car("AAB-5566");
     //   Car truck = new Truck("DE-556");
      //  writer.write(car.id+",");


    }
}
