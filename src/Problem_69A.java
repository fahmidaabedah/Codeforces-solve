import java.util.Scanner;

public class Problem_69A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        int[] arr = new int[3];
        int sumx = 0;
        int sumy = 0;
        int sumz = 0;
        while (testcase-- > 0) {
            for (int i = 0; i < 3; i++) {

                arr[i] = sc.nextInt();

            }
//            sumx = sumx + arr[0];
//            sumy = sumy + arr[1];
//            sumz = sumz + arr[2];
        }
        System.out.println(sumx);
        System.out.println(sumy);
        System.out.println(sumz);
        if (sumx == 0 && sumy == 0 && sumz == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
