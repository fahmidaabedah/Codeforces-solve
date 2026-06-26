import java.util.Scanner;

public class Problem_467A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int count = 0;
        while (testcases-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (q - p >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
