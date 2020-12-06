public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        int newNumber = reverse(number);
        int countDigitsOriginal = getDigitCount(number);
        int countDigitsReversed = getDigitCount(newNumber);

        if(number == 0){
            System.out.println("Zero");
        }

        while(newNumber > 0){
            int lastDigit = newNumber % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            newNumber /= 10;
        }
        for(int i = 0; i < countDigitsOriginal - countDigitsReversed; i++){
            System.out.println("Zero");
        }
    }
    public static int reverse(int number){
        int reverse = 0;
        int numberUse = number;

        while (numberUse > 0){
            reverse = reverse * 10 + numberUse % 10;
            numberUse /= 10;
        }
        if(numberUse < 0){
            numberUse = Math.abs(numberUse);
            while (numberUse > 0){
                reverse = reverse * 10 + numberUse % 10;
                numberUse /= 10;
            }
            reverse = -1 * reverse;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }else if(number == 0){
            return 1;
        }
        int countDigits = 0;
        while (number > 0) {
            countDigits++;
            number /= 10;
        }
        return countDigits;
    }
}
