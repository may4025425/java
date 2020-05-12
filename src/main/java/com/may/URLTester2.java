package com.may;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTester2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://tw.yahoo.com");
           // URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line = reader.readLine();
            StringBuilder sb = new StringBuilder();
            while (line != null){
               // System.out.println(line);
                sb.append(line);
                line = reader.readLine();
            }
            System.out.println(sb.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
