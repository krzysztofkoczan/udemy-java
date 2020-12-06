public class Switch {

    public static void main (String[] args){
        int value = 3;
        if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else{
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 3;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("was 3, or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;

            default:
                System.out.println("Value was not 1,2,3,4 or 5");
                break;
        }

        /**
         * Challenge
         */

        int switchChar = 'X';

        switch(switchChar){
            case 'A':
                System.out.println("It was A");
                break;

            case 'B':
                System.out.println("It was B");
                break;

            case 'C':
                System.out.println("It was C");
                break;

            case 'D':
                System.out.println("It was D");
                break;

            case 'E':
                System.out.println("It was E");
                break;

            default:
                System.out.println("Not found");
                break;
        }

        String month = "oCtober";

        switch (month.toLowerCase()){
            case "october":
                System.out.println("Oct");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }

        /**
         * Challenge
         */

        printDayOfTheWeek(3);
        printDayOfTheWeek(8);
    }
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;

            case 1:
                System.out.println("Tuesday");
                break;

            case 2:
                System.out.println("Wednesday");
                break;

            case 3:
                System.out.println("Thursday");
                break;

            case 4:
                System.out.println("Friday");
                break;

            case 5:
                System.out.println("Saturday");
                break;

            case 6:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}
