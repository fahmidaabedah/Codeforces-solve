import java.util.Scanner;

public class Problem_231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = 0;
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                int x = sc.nextInt();
                if (x == 1) {
                    count++;
                }
            }
            if (count >= 2) {
                Y++;
            }
        }

        System.out.println(Y);
    }
}
