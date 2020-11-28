public class Operators {

    public static void main (String[] args){

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result = " + previousResult);

        result = result * 10;   // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;    // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder if (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++;   // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--;   // 2 - 1 = 2
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2;
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result = result / 30;
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2;
        result -= 2;
        System.out.println("10 - 2 = " + result);

        /**
         * if-then
         */
        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!" +
                    "\nSadly, because I wanted to see an alien");
        }

        /**
         * Logical AND Operator
         */
        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        /**
         * Logical OR Operator
         */
        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either OR both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }

        /**
         * Ternary Operator
         */
        isCar = true;
        boolean wasCar = isCar ?  true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        int ageOfClient = 17;
        boolean isEighteenOrOver = (ageOfClient >= 18) ? true : false;
        if (isEighteenOrOver){
            System.out.println("It is ok");
        }

        /**
         * Summary of Operators
         * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
         */
        /**
         * Precedence Operator
         * http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
         */

        /**
         * Challenge
         */
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double thirdValue = 100.00d * (firstValue + secondValue);
        double remainderValue = thirdValue % 40.00d;
        boolean isZeroOrNo = (remainderValue == 0) ? true : false;
        System.out.println(isZeroOrNo);
        if (!isZeroOrNo){
            System.out.println("Got some remainder");
        }
    }
}
