import java.util.Arrays;
import java.util.Scanner;

public class Problem_1742A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer testcases = sc.nextInt();
        Integer[] arr = new Integer[3];
        int totalSum = 0;
        int mySum = 0;
        while (testcases-- > 0) {
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                totalSum += arr[i];
            }
            Arrays.sort(arr);
            mySum = arr[0] + arr[1];

            if (mySum == arr[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
