public class TeenNumberChecker {

    public static boolean hasTeen (int firstValue, int secondValue, int thirdValue){

        if ( (firstValue >= 13 && firstValue <= 19) || (secondValue >= 13 && secondValue <= 19) ||
                (thirdValue >= 13 && thirdValue <= 19) ) {

            return true;
        }

        return false;
    }

    public static boolean isTeen (int firstValue){
        return ( firstValue >= 13 && firstValue <= 19);
    }
}
