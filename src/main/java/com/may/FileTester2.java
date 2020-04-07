package com.may;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester2 {
    public static void main(String[] args) {
        try {
            /*File file = new File("test.txt");
            FileOutputStream fos = new FileOutputStream(file);*/
            FileOutputStream fos = new FileOutputStream("test.txt");
            fos.write(65);
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
