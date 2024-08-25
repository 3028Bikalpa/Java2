import java.util.Scanner;

public class ConsecutiveFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of values that you want to check: ");
        int len = sc.nextInt();
        int[] values = new int[len];
        System.out.println("Enter the values: ");
        for (int i = 0; i < len; i++) {
            values[i] = sc.nextInt();
        }
        boolean condition = false;
        for (int i = 0; i < len - 3; i++) {
            if (values[i] == values[i + 1] && values[i + 1] == values[i + 2] && values[i + 2] == values[i + 3]) {
                condition = true;
                break;
            }
        }
        if (condition) {
            System.out.println("The list has consecutive fours");
        } else {
            System.out.println("The list has no consecutive fours");
        }
    }
}
