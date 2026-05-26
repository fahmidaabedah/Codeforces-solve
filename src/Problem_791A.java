import java.util.Scanner;

public class Problem_791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int l = sc.nextInt();
        int b = sc.nextInt();
        while (l <= b) {
            l = l * 3;
            b = b * 2;
            count++;
            if (l > b) {
                break;
            }
        }
        System.out.println(count);
    }
}
