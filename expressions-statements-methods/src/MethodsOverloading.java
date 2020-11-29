public class MethodsOverloading {

    public static void main (String[] args){

        int newScore = calculateScore("Chris", 5_000);
        System.out.println("New score is " + newScore);
        calculateScore(700);
        calculateScore();

        /**
         * Challenge
         */
        calcFeetAndInchesToCentimeters(6, 12);
        calcFeetAndInchesToCentimeters(157);

    }

    public static int calculateScore (String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");

        return score * 1_000;
    }

    public static int calculateScore (int score){
        System.out.println("Unnamed player scored " + score + " points");

        return score * 1_000;
    }

    public static int calculateScore (){
        System.out.println("No player name, no player score");

        return 0;
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches){
        if ( (feet < 0) || (inches < 0) || (inches > 12) ){
            System.out.println("Invalid feet or inches parameters!");
            return -1;

        }
        double howManyCm = ( ((feet * 12) + inches) * 2.54 );
        System.out.println(feet + " ft and " + inches + " inch = " + howManyCm + " cm");
        return howManyCm;
    }

    public static double calcFeetAndInchesToCentimeters (double inches){
        if (inches >= 0){
            double feet = (int) (inches / 12);
            double remainingInches = (int) (inches % 12);
            System.out.println(inches + " inch is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}
