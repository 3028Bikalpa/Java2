import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {
            System.out.println("Enter salary whose average you want to find or enter -1 to stop: ");
            double salary = sc.nextDouble();
            if (salary == -1) break;
            if (salary < 0) {
                System.out.println("Salary cannot be negative. Try again.");
                continue;
            }
            sum = sum+salary;
            count++;
        }
        if (count > 0) {
            double average = sum / count;
            System.out.println("Average salary: " + average);
        } else {
            System.out.println("You did not enter any salary");
        }
    }
}
