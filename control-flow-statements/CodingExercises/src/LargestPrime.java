public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int i = 2;

        while (i < number) {
            if (number % i == 0) {
                number /= i;
                continue;
            }
            i++;
        }
        return i;
    }
}
