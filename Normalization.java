import java.util.Scanner;

public class Normalization {

    public static double max(double[] arr) {
        double maxValue = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i]; 
            }
        }
        return maxValue;
    }

    public static double min(double[] arr) {
        double minValue = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i]; 
            }
        }
        return minValue;
    }

    public static void scale(double[] arr) {
        double minValue = min(arr); 
        double maxValue = max(arr); 
        double difference = maxValue - minValue; 

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] - minValue) / difference;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];

        System.out.println("Enter " + n + " float-point or integer numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        scale(arr);

        System.out.println("The scaled array is:");
        for (double num : arr) {
            System.out.println(num);
        }
    }
}
