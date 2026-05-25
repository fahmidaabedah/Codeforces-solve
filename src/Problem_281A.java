import java.util.Scanner;

public class Problem_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] arr = text.toCharArray();
        System.out.print(Character.toUpperCase(text.charAt(0)));
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
