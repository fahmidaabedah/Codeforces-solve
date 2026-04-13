import java.util.Scanner;

public class problem2171B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testcase = s.nextInt();
        while (testcase != 0) {
            int size = s.nextInt();
            int[] a = new int[size];
            for (int i = 0; i < size; i++) {
                a[i] = s.nextInt();
            }
            if (a[size - 1] == -1 && a[0] == -1) {
                a[size - 1] = 0;
                a[0] = 0;
            } else if (a[size - 1] == -1) {
                a[size - 1] = a[0];
            } else if (a[0] == -1) {
                a[0] = a[size - 1];
            }
            int sum = Math.abs(a[size - 1] - a[0]);
            System.out.println(sum);
            for (int i = 0; i < size; i++) {
                if (a[i] == -1) {
                    a[i] = 0;
                }
                System.out.print(a[i] + " ");
            }

            testcase--;
        }
    }
}
