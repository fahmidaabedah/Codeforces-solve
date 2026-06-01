import java.util.Scanner;

public class Problem_1374B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase-- > 0) {
            int number = sc.nextInt();
            int a = 0;
            int b = 0;
            while (number % 2 == 0) {
                a++;
                number = number / 2;
            }
            while (number % 3 == 0) {
                b++;
                number = number / 3;

            }
            if (number != 1 || a > b) {
                System.out.println("-1");
            } else {
                System.out.println(2 * b - a);
            }
        }

    }
}
