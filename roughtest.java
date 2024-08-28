
import java.util.Scanner;


public class roughtest {
    public static void main(String[] args) {
        // // char a = 'a';
        // int a = 88;
        // System.out.printf("The ASCII value of the character that you printed is: %c", a);
        // int[] a = {0, 1, 2, 3, 4};
        // int[] b = {10, 11, 44, 99};
        // System.out.println(a[2]);
        // System.out.println(b[2]);
        // a=b;
        // b=a;
        // System.out.println(a[2]);
        // System.out.println(b[2]);

        // int[][] my2DArray;
        // my2DArray = new int[3][];
        // my2DArray[0] = new int[4];
        // my2DArray[1]=new int[4];
        // my2DArray[2]=new int[4];

        // System.out.println(my2DArray);
        // System.out.println(my2DArray[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Which number of day do you want to print?");
        int num = sc.nextInt();
        switch(num){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
        }
    }
}
