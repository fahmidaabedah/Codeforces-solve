import java.util.Scanner;

public class Problem_750A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++) {
            k += 5 * i;
//            System.out.println(k);
            if (k > 240) {
                break;
            }

        }
        System.out.println(i - 1);

    }
}
