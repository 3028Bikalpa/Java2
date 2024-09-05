
import java.io.FileNotFoundException;
public class ExceptionDemo {
    public static void main(String[] args) throws FileNotFoundException {
        String myName="Toyota";
        //syntax error
        int i = (int)(10*34.5);

        // runtime error
        // int j = 50/0; //exception not caught

        //exception handling

        //null pointer exception
        String s = "Binhan Chen";
        char c = s.charAt(0);

        Student s1 = new Student();
        s1.name ="Dongyu";
        Student[] stuArray = new Student[40];
        stuArray[1] = new Student();
        stuArray[1].name = "Muyu";

        try {
            // int j = 50/0;
            double d = 50/0.0;
            System.out.println("d = "+d);
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

        //demo in exception throwing
        // try {
        //     Scanner in = new Scanner(new File("Feiyang.txt"));
        // } catch (FileNotFoundException e) {
        //     System.out.println("我不认识那个人");
        // }
        //Scanner in = new Scanner(new File("Feiyang.txt"));
        Student xinyi = new Student();
        try {
            String reaction = xinyi.reactToGrade(98+2);
            System.out.println(reaction);
        } catch (HeartBrokenException e) {
            System.out.println("Xinyi is hearbroken even with 98 points!");
       }
       finally{
        System.out.println("At least, I'm done");
       }
    }
}

class Student{
    String name;
    String reactToGrade(int points) throws HeartBrokenException{
        if(points > 97) return "Ecstatic";
        else if (points > 75) return "Okay";
        else if(points>60) return "Depressed!!!";
        // else return "Quit!";
        throw new HeartBrokenException("I am DONE");
    }
}

class HeartBrokenException extends Exception{
    HeartBrokenException (String msg){
        super(msg);
    }
}
interface Anar1{
    void NotInYesterday();
    String placeToGo="Shanghai";
}