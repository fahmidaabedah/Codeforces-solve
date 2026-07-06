import java.util.Locale;
import java.util.Scanner;

public class Problem_520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String text = sc.next().toLowerCase();
        if (size < 26) {
            System.out.println("NO");
            return;
        }
        boolean[] found = new boolean[26];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            found[ch - 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (!found[i]) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
