import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Problem_230B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        long[] arr = new long[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();
            boolean prime = true;
            long s = (long) sqrt(arr[i]);
            if (s < 2) {
                prime = false;
            }
            for (long j = 2; j <= Math.sqrt(s); j++) {
                if (s % j == 0) {
                    prime = false;
                }
            }
            if (s * s == arr[i] && prime) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

    }
}


