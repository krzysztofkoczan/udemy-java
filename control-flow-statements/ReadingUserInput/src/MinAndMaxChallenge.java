import java.util.Scanner;

public class MinAndMaxChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int maxNumber = 0;
//        int minNumber = 0;
        int maxNumber = Integer.MIN_VALUE;
        int minNumber = Integer.MAX_VALUE;
        int counter = 1;

        //flag
//        boolean first = true;

        while(true) {

            System.out.println("Enter " + counter + " number = ");
            boolean hasNextIn = scanner.hasNextInt();

            if (hasNextIn) {
                int number = scanner.nextInt();

//                if(first){
//                    first = false;
//                    maxNumber = number;
//                    minNumber = number;
//                }

                if(number > maxNumber){
                    maxNumber = number;
                }

                if(number < minNumber){
                    minNumber = number;
                }
            } else {
                break;
            }
            counter++;
            scanner.nextLine();
        }
        System.out.println("Max value: " + maxNumber + "\nMin value: " + minNumber);
        scanner.close();
    }
}
