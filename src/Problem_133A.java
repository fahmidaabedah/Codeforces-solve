import java.util.Scanner;

public class Problem_133A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();
        if (p.contains("Q") || p.contains("H") || p.contains("9")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
