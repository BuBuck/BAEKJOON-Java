package ex4;

import java.util.Scanner;

public class Ex7_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[31];
        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            n[a] = 1;
        }

        for (int i = 1; i <= 30; i++) {
            if (n[i] == 0) {
                System.out.println(i);
            }
        }
    }
}