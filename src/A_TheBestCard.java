import java.util.Scanner;

public class A_TheBestCard {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean prime = true;
            for (int i = 2; i <= (n+1)/ 2; i++) {
                if ((n + 1) % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
