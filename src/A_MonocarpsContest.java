import java.util.Scanner;

public class A_MonocarpsContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            int count = 0;
            int result = 0;
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    count++;
                }
            }
            if (count < 2 ) {
                result = -1;
            } else if (arr[0] == 0 && arr[size - 1] == 0) {
                result = 0;
            } else if (arr[0] != arr[size - 1] && count >= 2) {
                result = 1;
            } else if (arr[0] == 1 && arr[size - 1] == 1 && count >= 2) {
                result = 2;
            }
            System.out.println(result);
        }

    }
}
