public class ExceptionDemo {
    public static void main(String[] args) {
        String myName="Toyota";
        //syntax error
        int i = (int)(10*34.5);

        // runtime error
        // int j = 50/0; //exception not caught

        //exception handling
        try {
            int j = 50/0;
        } 
        //if exception occurs from above
        catch (ArithmeticException e) {
            //here we handle the exception
            System.out.println("Hi! You're divided by zero");
        }

        try {
            int[] myArray = new int[10];
            int k = myArray[12]; //out of bounds
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("The index number of array that you entered is out of bounds of the declared array");
        }

        try {
            int m = 50/0;
            int[] myArray = new int[10];
            int k = myArray[12]; //out of bounds
        } 
        catch (Exception e) { //In this case, we can also add RunetimeException instead of just Exception
            System.out.println("There is an issue with this program");
        }
        //We can use multiple catch in order to catch multiple types of exceptions in the same program, but the thing is, once the first error is found the compiler
        // breaks from that sequence and goes to catch, which means once the first error is found then it will directly go to catch rather than checking for other exceptions
        
    }
}

interface Anar1{
    void NotInYesterday();
    String placeToGo="Shanghai";
}