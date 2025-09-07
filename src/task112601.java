import java.util.Scanner;
public class task112601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) System.out.println(2);
        else {
            int[] fib = new int[50];
            fib[0] = 1;
            fib[1] = 1;
            System.out.println(fibch(n, fib));
        }
    }
    private static int fibch(int n, int[] fib){
        for (int i = 2; i < n+2; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            if (fib[i] == n) {
                return i+1;
            }
            if (fib[i] > n) {
                return -1;
            }
        }
        return fib[n];
    }
}
