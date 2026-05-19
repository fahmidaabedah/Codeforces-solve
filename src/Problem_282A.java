import java.util.Scanner;

public class Problem_282A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        sc.nextLine();
        int x = 0;
        while (testcases-- > 0) {
            String Input = sc.nextLine();
            if (Input.equals("X++")) {
                x++;
            }
            if (Input.equals("X--")) {
                x--;
            }
            if (Input.equals("++X")) {
                ++x;
            }
            if (Input.equals("--X")) {
                --x;
            }
        }
        System.out.println(x);
    }
}
