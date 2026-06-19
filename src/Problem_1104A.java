import java.util.Scanner;

public class Problem_1104A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int building = sc.nextInt();
            int[] arr = new int[building];
            for (int i = 0; i < building; i++) {
                arr[i] = sc.nextInt();
            }
            long ans = 0;
            int mini = Integer.MAX_VALUE;
            for (int i = 0; i < building; i++) {
                mini = Math.min(mini, arr[i]);
                ans += mini;
            }
            System.out.println(ans);
        }

    }
}

