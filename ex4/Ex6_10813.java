package ex4;

import java.util.Scanner;

public class Ex6_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] basket = new int[n];

        basket[0] = 1;
        for (int i = 1; i < n; i++) {
            basket[i] = basket[i - 1] + 1;
        }

        for (int i = 0; i < m; i ++) {
            int iNum = sc.nextInt();
            int jNum = sc.nextInt();
            int temp;

            temp = basket[iNum - 1];
            basket[iNum - 1] = basket[jNum - 1];
            basket[jNum - 1] = temp;
        }

        for (int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}

// 1 2 3 4 5