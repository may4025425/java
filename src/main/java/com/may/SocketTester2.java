package com.may;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTester2 {
    public static void main(String[] args) {
        try {
        ServerSocket serverSocket = new ServerSocket(3333);
            while (true) {
                System.out.println("Waiting for client.....");
                Socket socket = serverSocket.accept();
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String line = br.readLine();
                System.out.println(line);
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                writer.println("Hello," + line);
//                InputStream is = socket.getInputStream();
//                OutputStream os = socket.getOutputStream();
//                String name = "May\n";
//                os.write(name.getBytes());
                writer.flush();
//                int n = is.read();
//                while (n != '\n') {
//                    System.out.println((char) n);
//                    n = is.read();
//                }
                writer.close();
                br.close();
                socket.close();
                System.out.println("Client closed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
