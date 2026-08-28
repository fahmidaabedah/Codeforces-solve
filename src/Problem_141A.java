import java.util.Scanner;

public class Problem_141A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String l = sc.nextLine();
        String s = a + b;
        int[] freq = new int[26];
        int[] arr = new int[26];
        if (s.length() != l.length()) {
            System.out.println("NO");
        } else {
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'A']++;
            }
            for (int i = 0; i < l.length(); i++) {
                arr[l.charAt(i) - 'A']++;
            }
            boolean possible = true;
            for (int i = 0; i < 26; i++) {
                if (freq[i] != arr[i]) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
