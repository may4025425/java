package com.fju.mid;

import java.io.*;
import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        int r = (int) (Math.random() * 10 + 1);
        int n, times = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("number.txt"));
            try{
                r = Integer.parseInt(bufferedReader.readLine());
                times = Integer.parseInt(bufferedReader.readLine());
                bufferedReader.close();
            } catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("請輸入要猜的數字(1~10): ");
            n = scanner.nextInt();
            while (n != r) {
                times = times + 1;
                if (r < n) {
                    System.out.println("猜的數字太大!");
                } else if (r > n) {
                    System.out.println("猜的數字太小!");
                }
                System.out.println("已猜了: " + times);
                System.out.println("請繼續猜數字(1~10): ");
                n = scanner.nextInt();
            }
            System.out.println("猜中了!");
            try {
                FileWriter fileWriter = new FileWriter("number.txt");
                fileWriter.write("秘密數字為: " + r + "\n");
                fileWriter.write("猜了: " + times + "次");
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

