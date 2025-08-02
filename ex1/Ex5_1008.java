package ex1;

import java.util.Scanner;

public class Ex5_1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt();

        System.out.printf("%.9f \n", (double)a / b);
    }
}
