import java.util.Scanner;

public class problem2184A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testCases = s.nextInt();
        while (testCases != 0) {
            int people = s.nextInt();
            testCases--;
            int diff = 0;
            if (people == 2) {
                diff = 2;
            } else if (people == 3) {
                diff = 3;
            } else if (people % 2 == 1) {
                diff = 1;
            } else if (people % 2 == 0) {
                diff = 0;
            }
            System.out.println(diff);
        }
    }
}
