public class StatementsWhiteSpaceAndIndenting {

    public static void main (String[] args){
        
        int myVariable = 50;    // this line is a statement
        myVariable++;   //this line is a statement
        System.out.println("test");     //that's too

        // that's ok:
        System.out.println("This is" +
                " another " +
                " still more.");

        // that's ok, but don't use it
        int anotherVariable = 5; anotherVariable--; anotherVariable++;
    }
}
