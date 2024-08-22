import java.util.Scanner;

public class ArrayReverse {
    static void approachOne(String a){
        
    }
    static void approachTwo(String b){
        int l = b.length();
        String rev = "";
        for (int i = l-1; i >= 0; i--) {
            char c = b.charAt(i);
            rev=rev+c;
        }
        System.out.println("The reverse string is: "+rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string that you want to reverse: ");
        String imp = sc.nextLine();
        approachOne(imp);
        approachTwo(imp);
    }
}
