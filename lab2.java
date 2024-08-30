
public class lab2 {
    public enum Day{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number that you want to perform the operation on: ");
        // int num = sc.nextInt();
        // int answer, count=0;
        // while(num != 1){
        //     if(num%2==0){
        //         answer = num/2;
        //     }
        //     else{
        //         answer = (3*num)+1;
        //     }
        //     num = answer;
        //     count ++;
        // }
        
        // System.out.println("The answer as per the requirements is: "+count);
        // Scanner sc = new Scanner(System.in);
        // System.out.println("How many numbers do you want to have in the sequence?");
        // int terms = sc.nextInt();
        // int c=0;
        // if(terms<3){
        //     System.out.println("You will not be able to visialize the fibonacci series well");
        // }
        // else{
        //     System.out.println("Enter the first term: ");
        //     int a = sc.nextInt();
        //     System.out.println("Enter the second term: ");
        //     int b = sc.nextInt();
        //     System.out.println("Here is the fibonacci series as per the requirements that you entered: ");
        //     System.out.println(a);
        //     System.out.println(b);
        //     for (int count = 2; count < terms; count++) {
        //         c=a+b;
        //         System.out.println(c);
        //         a=b;
        //         b=c;
        //     }
            
        // }

        // float myFloatArray[];
        // myFloatArray= new float[2];
        // myFloatArray[0]=5.5f;
        // myFloatArray[1]=2.5f;
        // System.out.println(myFloatArray[1]);
        
        Day day = Day.MONDAY; //Here, Day is the method because of which we could make a variable day of the type Day to make our calculations easier
        
        switch (day) {
            case SUNDAY:
                System.out.println("Today is Monday");
                break;
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Monday");
                break;
            case WEDNESDAY:
                System.out.println("Today is Monday");
                break;
            case THURSDAY:
                System.out.println("Today is Monday");
                break;
            case FRIDAY:
                System.out.println("Today is Monday");
                break;
            case SATURDAY:
                System.out.println("Today is Monday");
                break;
            default:
                System.out.println("Error!");
        }

    }
}
