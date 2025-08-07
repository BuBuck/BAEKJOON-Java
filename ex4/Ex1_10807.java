package ex4;

import java.util.Scanner;

public class Ex1_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int[] nums = new int[n];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int v = sc.nextInt();

        for (int num : nums) {
            if (num == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
