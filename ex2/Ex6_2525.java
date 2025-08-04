package ex2;

import java.util.Scanner;

public class Ex6_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();


        if (b + c < 60 ) {
            b += c;
        } else {
            a += (b + c) / 60;
            b = (b + c) % 60;

            if (a == 24) {
                a = 0;
            } else if (a > 24) {
                a -= 24;
            }
        }

        System.out.println(a + " " + b);
    }
}
