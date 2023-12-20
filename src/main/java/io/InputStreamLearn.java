package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamLearn {

    public static void main(String[] args) {

        //InputStream is an abstract class and implements Closeable

        //Create an input stream???
        InputStream myInput = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        System.out.println("I just created this input stream: " + myInput);
        //public int read(byte b[]) throws IOException
        //returns total number of bytes read into buffer, or -1 if no more data because end of stream has been reached
        byte[] myByteArray = {0,1,2,3,4,5};
        try{
            int readByte = myInput.read(myByteArray);
            System.out.println("myInput.read(myByteArray) = " + readByte);
        } catch (Exception e){
            e.getStackTrace();
        }
        //public int read(byte b[], int off, int len) throws IOException
        //off = start offset, len = maximum length of bytes to read
        try{
            int readByte = myInput.read(myByteArray, 1,2);
            System.out.println("myInput.read(myByteArray, 1, 2) = " + readByte);
        } catch (Exception e){
            e.getStackTrace();
        }
        //myInput.readAllBytes()
        //returns byte array containing bytes read from the input stream
//        try{
//            byte[] readByte = myInput.readAllBytes(); //out of memory error: required array size too large
//            System.out.println("myInput.readAllBytes() = " + readByte);
//        } catch (Exception e){
//            e.getStackTrace();
//        }
        ///myInput.readNBytes(int len)

        try{
            byte[] readByte = myInput.readNBytes(3);
            System.out.println("myInput.readNBytes(3) = " + readByte);
            for (byte b:readByte
                 ) {
                System.out.println(b);
            }
        } catch (Exception e){
            e.getStackTrace();
        }
        //myInput.readNBytes(byte[] b, int off, int len)
        try{
            int readByte = myInput.readNBytes(myByteArray,1,2);
            System.out.println("myInput.readNBytes(myByteArray, 1, 2) = " + readByte);
        } catch (Exception e){
            e.getStackTrace();
        }
        //myInput.markSupported()
        System.out.println("myInput.markSupported() = " + myInput.markSupported());
        //Close the input stream
        try{
            myInput.close();
        } catch (Exception e){
            e.getStackTrace();
        }


        //Create a null input stream
        InputStream myNullInput = InputStream.nullInputStream();
        System.out.println("Here is a null input stream: " + myNullInput);
        //myNullInput.ensureOpen() //DOESN'T WORK
//        try{
//            System.out.println("myNullInput.ensureOpen() = "+ myNullInput.ensureOpen());
//        } catch (Exception e){
//            e.getStackTrace();
//        }
        //myNullInput.read()
        try{
            System.out.println("myNullInput.read() = "+ myNullInput.read());
        } catch (Exception e){
            e.getStackTrace();
        }
        //myNullInput.available()
        try{
            System.out.println("myNullInput.available() = "+ myNullInput.available());
        } catch (Exception e){
            e.getStackTrace();
        }
        //myNullInput.close()
        try{
            myNullInput.close();
        } catch (Exception e){
            e.getStackTrace();
        }

        //OBJECT METHODS
        System.out.println("myNullInput as a string is: " + myNullInput.toString());
        System.out.println("The class of myNullInput is: " + myNullInput.getClass());


//        System.out.println("Enter your age:");
//
//        try{
//            int age = System.in.read();
//            System.out.println("The ASCII value of age is " + age);
//            System.out.println("The ASCII value of the first digit of your age minus 48 is " + (age-48));
//            System.out.println("The first character of your age is " + (char)age);
//
//        } catch (Exception e){
//            e.getStackTrace();
//        }
    }
}
