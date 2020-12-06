public class NumberPalindrome {

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int numberToCompare = number;
        if(number < 0){
            number *= -1;
            numberToCompare = number;
        }
        do {
            int lastDigit = number % 10;
            reverse = 10 * reverse + lastDigit;
            number /= 10;
        } while (number != 0);

        return reverse == numberToCompare;
    }
}
