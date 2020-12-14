import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int counter = 1;

        while (true){
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                avg = (double)sum / counter;
                counter++;
            }else{
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        scanner.close();
    }
}
