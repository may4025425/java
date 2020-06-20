package com.may.Parking;

public class Car {
    String id;
    long entering;
    long leaving;
    public Car (String id){   //command+n -> constructer
        this.id = id;
        entering= System.currentTimeMillis();

    }

}
