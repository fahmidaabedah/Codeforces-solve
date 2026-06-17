import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Problem_230B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();
            int count = 0;
            long s = (long) sqrt(arr[i]);
            if (s * s == arr[i]) {
                for (long j = 1; j <= s; j++) {
                    if (s % j == 0) {
                        count++;
                    }
                }
//                System.out.println(count);
                if (count == 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            } else {
                System.out.println("NO");
            }
        }
    }
}
