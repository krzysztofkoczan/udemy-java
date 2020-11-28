public class IfKeywordAndCodeBlocks {

    public static void main (String[] args){

        boolean gameOver = true;
        int score = 5_000;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5_000 && score > 1_000){
//            System.out.println("Your score was less than 5000 and grater than 1000");
//        }
//        else if(score < 1_000){
//            System.out.println("You scored less than 1000");
//        }
//        else{
//            System.out.println("Got here");
//        }
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1_000;
            System.out.println("Your final score was " + finalScore);
        }

        /**
         * Challenge
         */
        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Second score was " + finalScore);
        }
    }
}
