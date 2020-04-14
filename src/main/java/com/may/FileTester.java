package com.may;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTester {
    public static void main(String[] args) {
/*        File file = new File("src");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.);
 */
        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write(65);
            writer.write(66);
            writer.write("66,65");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
