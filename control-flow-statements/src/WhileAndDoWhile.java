public class WhileAndDoWhile {
    public static void main(String[] args) {
        int count = 0;
        while(count != 5){
            System.out.println("Count is " + count);
            count++;
        }

        count = 0;
        while(true){
            if(count == 5){
                break;
            }
            System.out.println("Count is " + count);
            count++;
        }

        count = 0;
        do{
            System.out.println("Count is " + count);
            count++;
        }while(count != 5);

        /**
         * Challenge
         */
        int number = 4;
        int finishNumber = 20;
        count = 0;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number is " + number);
            if(count == 5){
                break;
            }
        }
        System.out.println("Found " + count + " even numbers" +
                "\nBreaking the loop...");

        /**
         * Challenge Sum Digit
         */
        int numberToSumDigits = 125;

        while(numberToSumDigits < 80_000) {
            System.out.println("Sum of digits in number " + numberToSumDigits + " is " + sumDigits(numberToSumDigits));
            numberToSumDigits *= 23;
        }
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

    public static int sumDigits(int number){
        if(number <= 9) {
            return -1;
        }
        int sum = 0;
        while(number > 0){
            // get least-significant digit
            int digit = number % 10;
            sum += digit;
            // drop least-significant digit
            number /= 10;
        }
        return sum;
    }
}
