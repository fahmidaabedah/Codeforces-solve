import java.util.Scanner;

public class Problem_617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        while (x != 0) {
            count = count + (x / 5);
            x = x % 5;
            count = count + (x / 4);
            x = x % 4;
            count = count + (x / 3);
            x = x % 3;
            count = count + (x / 2);
            x = x % 2;
            count = count + (x / 1);
            x = x % 1;

        }
        System.out.println(count);
    }
}
