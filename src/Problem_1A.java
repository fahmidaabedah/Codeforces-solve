import java.util.Scanner;

public class Problem_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        double a = sc.nextDouble();

        long x = (long) Math.ceil(m / a);
        long y = (long) Math.ceil(n / a);
        System.out.println(x * y);
    }
}
