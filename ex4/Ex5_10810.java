package ex4;

import java.util.Scanner;

public class Ex5_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];
        for (int i = 0; i < m; i++) {
            int iNum = sc.nextInt();
            int jNum = sc.nextInt();
            int kNum = sc.nextInt();

            for (int j = iNum - 1; j < jNum; j++) {
                basket[j] = kNum;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
