package com.may;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTester1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://tw.yahoo.com");
            InputStream is = url.openStream();
            int n = is.read();
            while(n != -1){
                System.out.println((char)n);
                n = is.read();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
