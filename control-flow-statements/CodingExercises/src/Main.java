import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args){
        /**
         * Exercise 12
         */
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(1);
        NumberInWord.printNumberInWord(2);
        NumberInWord.printNumberInWord(3);
        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(5);
        NumberInWord.printNumberInWord(6);
        NumberInWord.printNumberInWord(7);
        NumberInWord.printNumberInWord(8);
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(10);

        /**
         * Exercise 13
         */
        System.out.println(NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 1800));

        /**
         * Exercise 14
         */
        System.out.println(SumOddRange.isOdd(3));
        System.out.println(SumOddRange.sumOdd(2, 10));

        /**
         * Exercise 15
         */
        System.out.println(NumberPalindrome.isPalindrome(11));
        System.out.println(NumberPalindrome.isPalindrome(-121));
        System.out.println(NumberPalindrome.isPalindrome(10203));

        /**
         * Exercise 16
         */
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(121));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(34567531));
        System.out.println(FirstLastDigitSum.sumFirstAndLastDigit(5));

        /**
         * Exercise 17
         */
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));

        /**
         * Exercise 18
         */
        System.out.println(SharedDigit.hasSharedDigit(23, 21));

        /**
         * Exercise 19
         */
        System.out.println(LastDigitChecker.hasSameLastDigit(21, 42, 73));
        System.out.println(LastDigitChecker.hasSameLastDigit(21, 41, 73));
        System.out.println(LastDigitChecker.hasSameLastDigit(121, 541, 738));

        /**
         * Exercise 20
         */
        System.out.println(GreatestCommonDivisor.getGreatestCommonDivisor(15, 30));

        /**
         * Exercise 21
         */
        FactorPrinter.printFactors(6);

        /**
         * Exercise 22
         */
        System.out.println(PerfectNumber.isPerfectNumber(5));
        System.out.println(PerfectNumber.isPerfectNumber(6));

        /**
         * Exercise 23
         */
        NumberToWords.numberToWords(234);
        NumberToWords.numberToWords(100);
        /**
         * Exercise 24
         */
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));

        /**
         * Exercise 25
         */
        System.out.println(LargestPrime.getLargestPrime(21));

        /**
         * Exercise 26
         */
        DiagonalStar.printSquareStar(8);

        /**
         * Exercise 27
         */
        //InputCalculator.inputThenPrintSumAndAverage();

        /**
         * Exercise 28
         */
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35));
        System.out.println(PaintJob.getBucketCount(3.4, 1.5));
    }
}
