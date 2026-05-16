import java.util.Scanner;

public class Problem_71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        sc.nextLine();
        while (testcases != 0) {
            String text = sc.nextLine();
            char[] arr = text.toCharArray();
            if (arr.length > 10) {
                int count = arr.length - 2;
                System.out.println("" + arr[0] + count + arr[arr.length - 1]);
            } else
                System.out.println(text);
            testcases--;
        }
    }
}
