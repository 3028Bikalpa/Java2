import java.util.Random;

public class RandomAverage {
    public static void main(String[] args) {
        Random num = new Random();
        double[] numbers = new double[5];
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            numbers[i] = num.nextDouble();
            sum = sum+numbers[i];
        }
        double average = sum / 5;
        double min = 1;
        double max = 0;
        for (int i = 0; i < 5; i++) {
            max=numbers[i]>max?numbers[i]:max;
            min=numbers[i]<min?numbers[i]:min;
        }
        System.out.println("The randomly generated numbers are: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("The avergae value is: " + average);
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: "+max);
}
}
