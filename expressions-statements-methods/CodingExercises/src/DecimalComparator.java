public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstParameter, double secondParameter){
        if ( (int)(firstParameter * 1_000) == (int)(secondParameter * 1_000) ){
            return true;
        }
        else return false;
    }
}
