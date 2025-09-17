package ex4;

import java.util.Scanner;

public class Ex8_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[42];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == a[j] % 42) {
                    b[i]++;
                }
            }

            if (b[i] > 0) count++;
        }

        System.out.println(count);
    }
}