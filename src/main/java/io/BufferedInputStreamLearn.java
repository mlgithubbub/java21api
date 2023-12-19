package io;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamLearn {

    public static void main(String[] args) {

        InputStream myInput1 = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        BufferedInputStream myBuffy = new BufferedInputStream(myInput1);

        BufferedInputStream myBuffyWithSize = new BufferedInputStream(myInput1,5);

        try{
            myBuffy.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


//        try{
//            myBuffy.readAllBytes(); //error: required array size too large
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



    }
}
