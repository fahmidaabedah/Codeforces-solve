import java.util.Scanner;

public class Problem_208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        text = text.replace("WUB", " ");
        System.out.println(text);
    }
}
