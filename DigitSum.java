import java.util.Scanner;

public class DigitSum {
    static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); 
            }
        }
        int sum = sumOfDigits(Math.abs(number));  
        System.out.println("The sum of the digits is: " + sum);
    }
}
