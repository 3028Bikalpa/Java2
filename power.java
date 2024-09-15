public class power {
    static long calPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return x * calPower(x, n - 1);
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(x + "^" + n + " = " + calPower(x, n));
    }
}
