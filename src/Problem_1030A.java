import java.util.Scanner;

public class Problem_1030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        int[] arr = new int[persons];
        for (int i = 0; i < persons; i++) {
            arr[i] = sc.nextInt();
        }
        boolean is_true = true;
        for (int i = 0; i < persons; i++) {
            if (arr[i] == 1) {
                is_true = false;
            }
        }
        if (is_true == false) {
            System.out.println("Hard");
        } else {
            System.out.println("Easy");
        }
    }
}
