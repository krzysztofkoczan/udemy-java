public class Methods {

    public static void main (String[] args){

        boolean gameOver = true;
        int score = 5_000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        /**
         * Challenge
         */
        int scorePosition = calculateHighScorePosition(1_500);
        displayHighScorePosition("Carl", scorePosition);

        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Matt", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("John", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Chris", scorePosition );

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2_000;
            return finalScore;
        }

        return -1;
    }

    public static int calculateHighScorePosition(int score){

//        if (score >= 1_000){
//            return 1;
//        } else if (score >= 500){
//            return 2;
//        } else if (score >= 100){
//            return 3;
//        }
//
//        return 4;
        int position = 4;   // last position will be returned

        if (score >= 1_000){
            position =1;
        } else if (score >= 500){
            position = 2;
        } else if (score >= 100){
            position = 3;
        }

        return position;
    }

    public static void displayHighScorePosition(String name, int score){
        System.out.println(name + " managed to get into position: " + score + " on the high score table");
    }
}
