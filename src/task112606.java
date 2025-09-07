import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class task112606 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] stolb = new int[n+1];
        stolb[1] = 0;
        int[] coins = new int[n+1];
        int[] path = new int[n+1];
        int step = 2;
        for (int l = 2; l < n; l++) {
            coins[l] = sc.nextInt();
        }
        for (int i = 2; i <= n; i++) {
            int m = stolb[i - min(i, k)];
            for (int j = i - min(i, k); j < i; j++) {
                if (j > 0) {
                    m = max(m, stolb[j]);
                    if (stolb[j] >= m) path[step] = j;
                }
            }
            stolb[i] = m + coins[i];
            step++;
        }
        System.out.println(stolb[n]);


        int i = n;
        int jumps = 0;
        int[] result = new int[n+1];
        result[0] = n;
        while (path[i] != 0){
            result[jumps] = path[i];
            jumps++;
            i = path[i];
        }
        System.out.println(jumps);
        for (int d = jumps - 1; d >= 0; d--) {
            System.out.print(result[d] + " ");
        }
        System.out.println(n);



    }
}