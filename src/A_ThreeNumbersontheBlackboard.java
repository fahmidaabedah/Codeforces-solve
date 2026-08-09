import java.util.Arrays;
import java.util.Scanner;

public class A_ThreeNumbersontheBlackboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Integer[] arr = new Integer[3];
        while (t-- > 0) {
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int result = 0;
            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                result = 0;
            }
            if (arr[0] + arr[1] > arr[2]) {
                result = arr[2] - arr[0];
            } else {
                result = arr[0] + arr[1] - arr[0];
            }
            System.out.println(result);
        }
    }
}
