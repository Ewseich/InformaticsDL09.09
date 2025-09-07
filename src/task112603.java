import java.util.Scanner;

import static java.lang.Math.min;

public class task112603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] stolb = new int[n+1];
        stolb[1] = 1;
        for (int i = 2; i <= n; i++) {
            int sum = 0;
            for (int j = i - min(i, k); j <= i; j++) {
                sum += stolb[j];
            }
            stolb[i] = sum;
        }
        System.out.println(stolb[n]);
    }
//    static int kol(int i, int k, int[] stolb) {
//        int sum = 0;
//        for (int j = i - min(i, k); j <= i; j++) {
//            sum += stolb[j];
//        }
//        return sum;
//    }
}
