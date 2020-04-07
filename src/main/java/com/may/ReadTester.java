package com.may;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line !=null){
                System.out.println(line);
                line = br.readLine();
            }

/*  接下去讀  data = fr.read();
            System.out.println((char)data);
             data = fr.read();
            System.out.println((char)data); */
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
