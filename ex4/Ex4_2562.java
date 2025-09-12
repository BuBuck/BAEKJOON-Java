package ex4;

import java.util.Scanner;

public class Ex4_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[9];

        nums[0] = sc.nextInt();
        int max = nums[0];
        int arrNum = 0;

        for (int i = 1; i < nums.length; i++) {
            nums[i] = sc.nextInt();

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (max == nums[i]) {
                arrNum = i + 1;
            }
        }

        System.out.println(max + "\n" + arrNum);
    }
}
