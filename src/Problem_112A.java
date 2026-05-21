import java.util.Locale;
import java.util.Scanner;

public class Problem_112A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().toLowerCase();
        String b = sc.nextLine().toLowerCase();

        int result = a.compareTo(b);
        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else if (result == 0) {
            System.out.println(0);
        }

    }
}
