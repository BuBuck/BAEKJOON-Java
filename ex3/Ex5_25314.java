package ex3;

import java.util.Scanner;

public class Ex5_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i += 4) {
            System.out.print("long ");
        }

        System.out.println("int");
    }
}
