import java.util.Scanner;

public class months {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer between 1 and 12: ");
            int monthIndex = scanner.nextInt();
            System.out.println("Month: " + months[monthIndex - 1] + ", Days: " + dom[monthIndex - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Wrong number! Please enter a number between 1 and 12.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
    }
}
