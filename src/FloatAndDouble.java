public class FloatAndDouble {

    /**
     * Primitive types: float and double
     */
    public static void main (String[] args){

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("My Int Value = " + myIntValue);
        System.out.println("My Float Value = " + myFloatValue);
        System.out.println("My Double Value = " + myDoubleValue);

        /**
         * Challenge
         */
        double valueOfPounds = 200d;
        double valueOfKilograms = valueOfPounds * 0.45359237d;
        System.out.println("\nChallenge:\nValue of = " + valueOfPounds + " pounds" +
                "\nIs equal to value of = " + valueOfKilograms + " kilograms");
    }
}
