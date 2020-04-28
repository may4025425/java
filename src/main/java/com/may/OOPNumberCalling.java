package com.may;

import java.io.*;
import java.util.Random;

public class OOPNumberCalling {
    int number = (int) (Math.random()*100);
    File file = new File("numbercalling.txt");
    public OOPNumberCalling(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String s = bufferedReader.readLine();
            number = Integer.parseInt(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
    }
    public void add() {
        number ++;
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(number));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
