import java.util.*;

public class Problem_1535B {


    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (x % 2 == 0)
                    even.add(x);
                else
                    odd.add(x);
            }

            ArrayList<Integer> arr = new ArrayList<>();

            arr.addAll(even);
            arr.addAll(odd);

            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    if (gcd(arr.get(i), 2 * arr.get(j)) > 1) {
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}

