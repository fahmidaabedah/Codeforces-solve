import java.util.Scanner;

public class Problem_1328A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % b == 0) {
                System.out.println(0);
            } else {
                System.out.println(b - a % b);
            }
        }

    }
}
