package com.may;

public class ThreadTester {
    public static void main(String[] args) {
        ThreadHorse h2 = new ThreadHorse();
        h2.start();
        ThreadHorse h3 = new ThreadHorse();
        h3.start();
        for(int i =0; i<100; i++){
            System.out.println(i);
            //System.out.println("第二匹"+i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
