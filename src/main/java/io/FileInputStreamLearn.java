package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamLearn {

    public static void main(String[] args) {


        try{
            //Create file input stream
            FileInputStream myFile = new FileInputStream("myfile.txt");

            //Create buffered input stream
            BufferedInputStream myBuffy = new BufferedInputStream(myFile);

            //Read first byte from file
            int i = myBuffy.read();

            while (i != -1){
                System.out.print((char)i);

                //Read next byte from the file
                i = myBuffy.read();
            }

            myBuffy.close();



        } catch (Exception e){
            e.getStackTrace();
        }


    }
}
