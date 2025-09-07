import java.util.Scanner;
public class task112602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] stolb = new int[n+1];
        stolb[1] = 1;
        for (int i = 2; i <= n; i++) {
            stolb[i] = stolb[i - 1] + stolb[i - 2];
        }
        System.out.println(stolb[n]);
    }
}
