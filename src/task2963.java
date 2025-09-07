import java.util.Scanner;

import static java.lang.Math.min;

public class task2963 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n+1];
        nums[1] = 0;
        for (int i = 1; i < n+1; i++) {
            nums[i] = nums[i - 1] + 1;
            if (i % 2 == 0) {
                nums[i] = min(nums[i], nums[i / 2] + 1);
            }
            if (i % 3 == 0) {
                nums[i] = min(nums[i], nums[i / 3] + 1);
            }
        }
        System.out.println(nums[n]-1);

    }
}
