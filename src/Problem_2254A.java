import java.util.Arrays;
import java.util.Scanner;
public class Problem_2254A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Integer[] arr = new Integer[3];
        while (t-- > 0) {
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            while (true) {
                Arrays.sort(arr);
                if (arr[0] == arr[1] || arr[1] == arr[2])
                    break;
                arr[0]++;
                arr[2]--;
                count++;

            }
            System.out.println(count);
        }

    }
}
