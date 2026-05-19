import java.util.Scanner;

public class Problem_158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int value = arr[k - 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && value <= arr[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
