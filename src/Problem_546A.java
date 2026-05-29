import java.util.Scanner;

public class Problem_546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int price = sc.nextInt();
        int money_have = sc.nextInt();
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            sum += (i * price);
        }
        if (money_have >= sum) {
            System.out.println(0);
        } else {
            System.out.println(sum - money_have);
        }
    }
}
