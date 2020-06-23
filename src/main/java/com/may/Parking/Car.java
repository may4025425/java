package com.may.Parking;


import java.util.Date;

public class Car {
    String carid;
    String id;
    long leaving;
    long entering;
    //Date entering;
   /* public Car(String carid) {
        this.carid = carid;
        entering = System.currentTimeMillis();
    }*/
    public Car (String id){   //command+n -> constructer
        this.id = id;
        entering= System.currentTimeMillis();
        // entering = new Date(System.currentTimeMillis());
    }
}
