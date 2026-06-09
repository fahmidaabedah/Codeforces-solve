import java.util.Scanner;

public class Problem_734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String gameWin = sc.next();
        int anton = 0;
        int danik = 0;
        for (int i = 0; i < size; i++) {
            if (gameWin.charAt(i) == 'A') {
                anton++;
            } else if (gameWin.charAt(i) == 'D') {
                danik++;
            }
        }
//        System.out.println(anton);
//        System.out.println(danik);
        if (anton > danik) {
            System.out.println("Anton");
        } else if (anton < danik) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
