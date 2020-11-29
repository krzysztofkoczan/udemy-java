public class MainV2 {

    public static void main (String[] args){
        /**
         * Exercise 8
         */
        System.out.println("\nExercise 8\n");
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(4.5, 5.0));
        System.out.println(AreaCalculator.area(-1, 3));
        /**
         * Exercise 9
         */
        System.out.println("\nExercise 9\n");
        MinutesToYearsDaysCalculator.printYearsAndDays(525600L);
        /**
         * Exercise 10
         */
        System.out.println("\nExercise 10\n");
        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,2,3);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(-1,2,3);
        /**
         * Exercise 11
         */
        System.out.println("\nExercise 11\n");
        System.out.println(PlayingCat.isCatPlaying(true, 25));
        System.out.println(PlayingCat.isCatPlaying(true, 50));
        System.out.println(PlayingCat.isCatPlaying(false, 25));
        System.out.println(PlayingCat.isCatPlaying(false, 15));
    }
}
