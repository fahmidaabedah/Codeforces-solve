import java.util.Arrays;
import java.util.Scanner;

public class Poblem_2218B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int[] arr = new int[7];
        while (testcases-- > 0) {
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 0; j < 6; j++) {
                sum += arr[j];
            }
            System.out.println(arr[6] - sum);

        }
    }
}
