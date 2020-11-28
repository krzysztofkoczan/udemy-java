package com.company;

public class ByteShortIntLong {

    /**
     * Primitive types: byte, short, int, long
     */
    public static void main(String[] args) {

        int myValue = 10_000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        /**
         * Overflow
         */
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        /**
         * Underflow
         */
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        /**
         * Arithmetic and Casting
         */

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        /**
         * Primitive types challenge
         */

        byte myChallengeByte = 10;
        short myChallengeShort = 20;
        int myChallengeInt = 100;
        long myChallengeLong = 50_000L;

        long myChallengeLongEqual = myChallengeLong + 10L *
                (myChallengeByte + myChallengeShort + myChallengeInt);
        short myChallengeShortEqual = (short)(1_000 + 10 *
                (myChallengeByte + myChallengeShort + myChallengeInt ));

        System.out.println("\nChallenge long equals = " + myChallengeLongEqual);
        System.out.println("\nChallenge short equals = " + myChallengeShortEqual);
    }
}
