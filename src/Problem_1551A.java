import java.util.Scanner;

public class Problem_1551A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            long value = sc.nextLong();
            long c1 = value / 3;
            long c2 = value / 3;
            if (value % 3 == 1) {
                c1++;
            } else if (value % 3 == 2) {
                c2++;
            }
            System.out.println(c1 + " " + c2);
        }

    }
}
