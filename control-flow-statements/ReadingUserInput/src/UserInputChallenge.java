import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int sum = 0;

        while(counter <= 10){

            System.out.println("Enter " + counter + " number = ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;

            }else{
                System.out.println("Invalid data type, try again...");

            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
