import java.util.Scanner;

public class Problem_58A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String target = "hello";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (count < target.length() && s.charAt(i) == target.charAt(count)) {
                count++;
            }
        }
        if (count == target.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
