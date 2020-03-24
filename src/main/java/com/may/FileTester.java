package com.may;

import java.io.File;

public class FileTester {
    public static void main(String[] args) {
        File file = new File("src");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
    }
}
