import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem_160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coins = sc.nextInt();
        Integer[] values = new Integer[coins];
        int totalSum = 0;
        int mySum = 0;
        int count = 0;
        for (int i = 0; i < coins; i++) {
            values[i] = sc.nextInt();
            totalSum += values[i];
        }
        Arrays.sort(values, Collections.reverseOrder());
        for (int value : values) {
            mySum += value;
            count++;
            if (mySum > totalSum - mySum) {
                break;
            }
        }
        System.out.println(count);

    }
}
