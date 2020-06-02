package com.may;

import java.util.Random;

public class Snow extends Thread {
    Random random = new Random();
    int x = random.nextInt(600);
    int y = random.nextInt(450);
    SnowCanvas parent;
    public Snow(SnowCanvas parent) {
        this.parent = parent;
    }

    public void run() {//可以製造讓雪動的效果
        for (int i = 0; i < 100; i++) {
            int direction = random.nextInt(3) - 1;
            x = x + direction;
            y = y + 1;
            parent.repaint();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

