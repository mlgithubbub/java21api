package io;

public class BitsLearn {

    public static void main(String[] args) {

        byte[] myByteArray = {0,2,3};

        //Bits.getBoolean()
        boolean bool2 = Bits.getBoolean(myByteArray, 2);
        // boolean myByteArrayOff3 = Bits.getBoolean(myByteArray,3); //error: index 3 out of bounds
        boolean bool0 = Bits.getBoolean(myByteArray, 0);
        System.out.println(bool2);
        System.out.println(bool0);

        //Bits.getChar()
        char char0 = Bits.getChar(myByteArray,0);
        char char1 = Bits.getChar(myByteArray,1);
        System.out.println(char0);
        System.out.println(char1);

        //Bits.getShort()
        short short0 = Bits.getShort(myByteArray,0);
        short short1 = Bits.getShort(myByteArray,1);
        System.out.println(short0);
        System.out.println(short1);

        //Bits.getInt()
        // int int2 = Bits.getInt(myByteArray,2); //error: index 5 out of bounds for length 3
        // int int1 = Bits.getInt(myByteArray,1); //error: index 4 out of bounds for length 3
        // System.out.println(int2);
        // System.out.println(int1);
        //int int0 = Bits.getInt(myByteArray,-1); //error: index -1 out of bounds for length 3
        //System.out.println(int0);

        //Bits.getFloat()
//        float float0 = Bits.getFloat(myByteArray,0); //error: index 3 out of bounds for length 3
//        System.out.println(float0);

        //Bits.getLong()
//        long long0 = Bits.getLong(myByteArray,0); //error: index 7 out of bounds for length 3
//        System.out.println(long0);

        //Bits.getDouble()
//        double double0 = Bits.getDouble(myByteArray,0); //error: index 7 out of bounds for length 3
//        System.out.println(double0);

        //Bits.putBoolean()
        Bits.putBoolean(myByteArray,0,true);
        System.out.println(myByteArray[0]);
        System.out.println(Bits.getBoolean(myByteArray,0));

        //Bits.putChar()
        Bits.putChar(myByteArray,0,'c');
        System.out.println(myByteArray[0]);
        System.out.println(Bits.getChar(myByteArray,0));

        //Bits.putShort()
        Bits.putShort(myByteArray,0, (short)2);
        System.out.println(myByteArray[0]);
        System.out.println(Bits.getShort(myByteArray,0));

        //Bits.putInt()
//        Bits.putInt(myByteArray,0,5); //error: index 3 out of bounds for length 3
//        System.out.println(myByteArray[0]);
//        System.out.println(Bits.getInt(myByteArray,0));

        //Bits.putFloat()
//        Bits.putFloat(myByteArray,0,1); //error: index 3 out of bounds for length 3
//        System.out.println(myByteArray[0]);
//        System.out.println(Bits.getFloat(myByteArray,0));

        //Bits.putLong()
//        Bits.putLong(myByteArray,0,1); //error: index 7 out of bounds for length 3
//        System.out.println(myByteArray[0]);
//        System.out.println(Bits.getLong(myByteArray,0));

        //Bits.putDouble()
//        Bits.putDouble(myByteArray,0,1); //error: index 7 out of bounds for length 3
//        System.out.println(myByteArray[0]);
//        System.out.println(Bits.getDouble(myByteArray,0));
    }
}
