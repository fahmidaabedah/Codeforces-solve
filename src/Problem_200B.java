import java.util.Scanner;

public class Problem_200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sum += (double) p / 100.0;
//            System.out.println(sum);
        }
//        System.out.println(sum);
        double ans=sum / n*100;
        System.out.format("%.12f%n",ans);
    }
}
