package ex4;

import java.util.Scanner;

public class Ex3_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        nums[0] = sc.nextInt();

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i] = sc.nextInt();

            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println(min + " " + max);
    }
}
