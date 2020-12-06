public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int bigSize = 5;
        int i = 0;

        while (bigCount > 0){
            i++;
            if( (bigSize * i) == goal ){
                return true;
            }
            if( (bigSize * i) > goal ){
                i--;
                break;
            }
            bigCount--;
        }
        goal -= (i * bigSize);
        return goal <= smallCount;
    }
}
