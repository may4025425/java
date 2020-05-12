package com.may;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SocketTester {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("tw.yahoo.com",80);
            InputStream inputStream = socket.getInputStream();
            int n = inputStream.read();
            while (n!= -1){
                System.out.println((char)n);
                n = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
