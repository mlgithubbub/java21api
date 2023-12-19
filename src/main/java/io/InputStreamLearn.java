package io;

public class InputStreamLearn {

    public static void main(String[] args) {
        System.out.println("Enter your age:");

        try{
            int age = System.in.read();
            System.out.println("The ASCII value of age is " + age);
            System.out.println("The ASCII value of the first digit of your age minus 48 is " + (age-48));
            System.out.println("The first character of your age is " + (char)age);

        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
