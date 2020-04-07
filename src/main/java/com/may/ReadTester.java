package com.may;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTester {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            int data = fr.read();
            while (data !=-1){
                System.out.println((char)data);
                data = fr.read();
            } //-1指的是空值

/*  接下去讀  data = fr.read();
            System.out.println((char)data);
             data = fr.read();
            System.out.println((char)data);
            */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
