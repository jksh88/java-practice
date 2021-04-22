package com.jk;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE ;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        int tryThis = 2_147_483_647;
        System.out.println(tryThis);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value :" + myMinByteValue);
        System.out.println("Byte Max Value :" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShrotValue = Short.MAX_VALUE;
        System.out.println("Short Min Value: " + myMinShortValue);
        System.out.println("Short Max Value: " + myMaxShrotValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value: " + myMinLongValue);
        System.out.println("Long Max Value: " + myMaxLongValue);

        long myLongValue = 1000L;
        short testShort = 31333;
        byte myNewByteValue = (byte)(myMinByteValue /2); //default type for whole number in java is an int
        byte testByteValue = 88;
        System.out.println("myNewByteValue: " + myNewByteValue);
        short myNewShortValue = (short)(myMinShortValue / 2);
        System.out.println(myNewShortValue);

        byte fooByte = 111;
        short barShort = -24842;
        int yoInt = 8888778;
        long hiLong = 50000 + 10 * (fooByte + barShort + yoInt);
        System.out.println("hiLong: " + hiLong);

        float myMinFloatingValue = Float.MIN_VALUE;
        float myMaxFloatingValue = Float.MAX_VALUE;
        System.out.println("myMinFloatingValue: " + myMinFloatingValue);
        System.out.println("myMaxFloatingValue: " + myMaxFloatingValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("myMinDoubleValue: " + myMinDoubleValue);
        System.out.println("myMaxDoubleValue: " + myMaxDoubleValue);

        int myIntValue = 5 / 3 ;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println(myIntValue);
        System.out.println(myFloatValue);
        System.out.println(myDoubleValue);

        double lbs = 15.007;
        double kilo = lbs / 2.2;
        System.out.println(kilo + " kilogram");

    }

}

