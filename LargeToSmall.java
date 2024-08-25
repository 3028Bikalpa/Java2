import java.util.Scanner;

public class LargeToSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number that you want to sort: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int answer = 1;
        for (int i = 0; i < min; i++) {
            answer = answer*max;
        }
        System.out.println("The answer as per the given conditions is: "+answer);
    }
}
