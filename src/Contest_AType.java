import java.util.Scanner;

public class Contest_AType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x >= y && x % y == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
