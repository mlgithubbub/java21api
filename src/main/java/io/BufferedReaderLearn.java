package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderLearn {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffRead = new BufferedReader(input);

        try{
            int age = Integer.parseInt(buffRead.readLine());
            System.out.println(age);
            buffRead.close();
        } catch(Exception e){
            e.getStackTrace();
        }



    }
}
