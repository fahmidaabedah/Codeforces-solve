import java.util.Scanner;

public class A_Bigram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int num = sc.nextInt();
            int count = 0;
            int flag = 0;
            for (int i = 0; i < num; i++) {
                int ch = sc.nextInt();
                if (ch == 2) {
                    count++;
                }
                if (ch > 2) {
                    flag++;
                }
            }
            if (count < 2 && flag == 0) {
                System.out.println("NO");
            } else if (count > 1 || flag != 0) {
                System.out.println("YES");
            }
        }
    }
}
