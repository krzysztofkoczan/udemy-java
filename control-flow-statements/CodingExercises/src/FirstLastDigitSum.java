public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        int sum = lastDigit;

        while(number > 0){
            number /= 10;
            if(number > 10 && number < 100){
                int firstDigit = number / 10;
                sum += firstDigit;
                break;
            }
        } return sum;
    }
}
