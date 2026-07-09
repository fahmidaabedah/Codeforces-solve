import java.util.Scanner;

public class Problem_158B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x]++;
        }
        int taxi = 0;
        taxi += arr[4];
        taxi += arr[3];
        if (arr[1] > arr[3]) {
            arr[1] = arr[1] - arr[3];
        } else {
            arr[1] = 0;
        }
        taxi += arr[2] / 2;
        if (arr[2] % 2 == 1) {
            taxi++;
            if (arr[1] >= 2) {
                arr[1] -= 2;
            } else {
                arr[1] = 0;
            }

        }
        taxi += (arr[1] + 3) / 4;
        System.out.println(taxi);
    }
}
