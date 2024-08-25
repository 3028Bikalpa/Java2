/*public class ComputeDisplacement {
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double g = 9.80665;
        double displacement = x0 + v0 * t - (g * t * t) / 2;
        System.out.println("Displacement: " + displacement);
    }
}
I tried doing the program this way as we discussed in our lab session with the use of args command, but I'm not sureif its the problem with my IDE or something it shows this error:
cd /Users/bikalpa/Documents/github/cs201Java/java2 ; /usr/bin/env /Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home/bin/java -XX:+ShowCodeDetail
sInExceptionMessages -cp /Users/bikalpa/Library/Application\ Support/Code/User/workspaceStorage/a31b3c5ccf7f13cfd44c0560e2758d1c/redhat.java/jdt_ws/Java2_bc343ed6/bin ComputeDispla
cement 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at ComputeDisplacement.main(ComputeDisplacement.java:3)

When I asked GPT about it, it says it might be the error because of some run configuration in my IDE (I'm using VS code)
*/
import java.util.Scanner;
public class ComputeDisplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial velocity in m/s: ");
        double x0 = sc.nextDouble();
        System.out.println("Enter the final velocity in m/s: ");
        double v0 = sc.nextDouble();
        System.out.println("Enter the time taken in s: ");
        double t = sc.nextDouble();
        double g = 9.80665;
        double displacement = x0 + v0 * t - (g * t * t) / 2;
        System.out.println("The value of displacement is: " + displacement);
    }
}
