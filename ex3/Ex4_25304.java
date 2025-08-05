package ex3;

import java.util.Scanner;

public class Ex4_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x =  sc.nextInt();
        int n =  sc.nextInt();
        int[] a = new int[n], b = new int[n];

        int total = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            total += a[i] * b[i];
        }

        if (x == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
