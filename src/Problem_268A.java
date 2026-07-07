import java.util.Scanner;

public class Problem_268A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] home = new int[n];
        int[] guest = new int[n];
        int res = 0;
        for (int i = 0; i < n; i++) {
            home[i] = sc.nextInt();
            guest[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (home[i] == guest[j]) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
