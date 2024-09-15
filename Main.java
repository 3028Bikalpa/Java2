public class Main {
    static void checkEvenOdd(int num) {
        if (num == 0) {
            System.out.println("The number is even.");
        }
        else if (num == 1) {
            System.out.println("The number is odd.");
        }
        else {
            checkEvenOdd(num - 2);
        }
    }

    public static void main(String[] args) {
        checkEvenOdd(7);
        checkEvenOdd(10);
    }
}
