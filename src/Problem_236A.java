import java.util.Scanner;

public class Problem_236A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            Boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else if (count % 2 != 0) {
            System.out.println("IGNORE HIM!");
        }
    }
}
