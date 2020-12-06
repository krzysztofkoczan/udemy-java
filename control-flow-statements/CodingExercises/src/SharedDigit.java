public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }
        int storedSecond = second;
        while(first > 0){
            int digitFirst = first % 10;
            first /= 10;
            while (second > 0){
                int digitSecond = second % 10;
                second /= 10;
                if(digitFirst == digitSecond){
                    return true;
                }
            }
            second = storedSecond;
        }
        return false;
    }
}
