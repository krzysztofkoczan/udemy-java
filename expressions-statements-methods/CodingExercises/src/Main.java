public class Main {

    public static void main (String[] args){

        /**
         * Exercise 1
         */
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

        /**
         * Exercise 2
         */
        MegaBytesConverter.printMegaBytesAndKiloBytes(2049);

        /**
         * Exercise 3
         */
        System.out.println(BarkingDog.shouldWakeUp(true, 7));

        /**
         * Exercise 4
         */
        System.out.println(LeapYear.isLeapYear(1924));

        /**
         * Exercise 5
         */
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.5678, -3.5679));

        /**
         * Exercise 6
         */
        System.out.println(EqualSumChecker.hasEqualSum(1,1,2));

        /**
         * Exercise 7
         */
        System.out.println(TeenNumberChecker.hasTeen(12,19,25));
        System.out.println(TeenNumberChecker.isTeen(13));

    }
}
