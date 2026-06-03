import java.util.Scanner;

public class Problem_758A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < num; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] < max) {
                while (arr[i] != max) {
                    arr[i]++;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
