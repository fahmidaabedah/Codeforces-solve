import java.util.Scanner;

public class Problem_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int upper = 0;
        int lower = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(text.charAt(i))) {
                lower++;
            }
        }
        if (upper > lower) {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(Character.toUpperCase(text.charAt(i)));
            }
        } else if (upper < lower || upper == lower) {
            for (int i = 0; i < text.length(); i++) {
                System.out.print(Character.toLowerCase(text.charAt(i)));
            }
        }
    }
}
