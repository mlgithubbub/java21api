package io;

import java.util.Scanner;

public class ScannerLearn {

    public static void main(String[] args) {
        System.out.println("Enter your age: ");

        Scanner myScanner = new Scanner(System.in);

        int age = myScanner.nextInt();
        System.out.println(age);
    }
}
