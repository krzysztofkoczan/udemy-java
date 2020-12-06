public class ForStatement {
    public static void main (String[] args){
        System.out.println("10 000 at 2% interest = " + calculateInterest(10_000.0, 2.0));

        for(int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello");
        }

        /**
         * Challenge
         */
        double amount = 10_000;
        for(int interestRate = 2; interestRate < 9; interestRate++ ){
            System.out.println(amount + " at " + interestRate + "% interest = " +
                    String.format("%.2f",calculateInterest(amount, interestRate)));
        }

        System.out.println("\n");
        for(int interestRate = 8; interestRate > 1; interestRate-- ){
            System.out.println(amount + " at " + interestRate + "% interest = " +
                    String.format("%.2f",calculateInterest(amount, interestRate)));
        }

        /**
         * Challenge
         */
        int countOfPrimeNumbers = 0;
        for(int i = 0; i < 100; i++){
            if(isPrime(i)){
                System.out.println(i + " is prime number");
                countOfPrimeNumbers++;

                if(countOfPrimeNumbers == 10){
                    break;
                }
            }
        }

        /**
         * Sum 3 and 5 Challenge
         */
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1_000; i++){
            if( (i % 3 == 0) && (i % 5 == 0) ){
                System.out.println(i + " can be divided by 3 and 5");
                sum += i;
                count++;
                if(count == 5){
                    System.out.println("Breaking the loop...");
                    System.out.println("Sum of those numbers is " + sum);
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1 || n == 0){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return amount * (interestRate / 100);
    }
}
