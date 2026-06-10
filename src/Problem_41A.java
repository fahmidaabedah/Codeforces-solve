import java.util.Scanner;

public class Problem_41A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
//        System.out.println(reverse);
        if (reverse.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
