public class Strings {

    public static void main (String[] args){

        /**
         * byte
         * short
         * int
         * long
         * float
         * double
         * char
         * boolean
         */
        String myString = "This is a String";
        System.out.println("My String is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("My String is equal to " + myString);
        myString = myString + "\u00A9 2020";
        System.out.println("My String is equal to " + myString);
        String numberString = "250.76";
        numberString = numberString + "45.89";
        System.out.println(numberString);
        String lastString = "20";
        int myInt = 60;
        lastString = lastString + myInt;
        System.out.println("Last String is equal to " + lastString);
        double doubleNumber = 145.78d;
        lastString = lastString + doubleNumber;
        System.out.println("Last String is equal to " + lastString);
    }
}
