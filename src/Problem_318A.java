import java.util.Scanner;

public class Problem_318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long size = sc.nextLong();
        long position = sc.nextLong();
        long oddCount = (size + 1) / 2;
        if (position <= oddCount) {
            System.out.println(2 * position - 1);
        } else {
            System.out.println(2 * (position - oddCount));
        }

    }
}
