import java.util.Scanner;

public class stringarray {
    static void One(String [] a, int b){
        System.out.println("The reversed orderof the strings is: ");
        for (int i = b-1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
    static void Two(String [] c, int d){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many strings do you want to enter?");
        int l = sc.nextInt();
        String[] names = new String[l];
        System.out.println("Enter the strings that you want to enter");
        for (int i = 0; i < l; i++) {
            names[i]=sc.nextLine();
        }
        One(names, l);
        Two(names, l);
    }
}
