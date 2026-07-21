import java.util.Scanner;

public class Problem_996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tk = sc.nextInt();
        int count = 0;
        if (tk >= 100) {
            count += tk / 100;
            tk = tk % 100;
        }
        if (tk >= 20) {
            count += tk / 20;
            tk = tk % 20;
        }
        if (tk >= 10) {
            count += tk / 10;
            tk = tk % 10;
        }
        if (tk >= 5) {
            count += tk / 5;
            tk = tk % 5;
        }
        count += tk;
        System.out.println(count);
    }
}
