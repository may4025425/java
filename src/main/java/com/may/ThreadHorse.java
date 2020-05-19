package com.may;

public class ThreadHorse extends Thread{
    public void run(){
        for(int i = 0; i<100;i++){
            System.out.println("HH:" + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
