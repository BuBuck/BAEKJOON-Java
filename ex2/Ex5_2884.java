package ex2;

import java.util.Scanner;

public class Ex5_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt(), m = sc.nextInt();

        if (m >= 45) {
            m -= 45;
        } else {
            if (h > 0) {
                h -= 1;
                m += 15;
            } else {
                h = 23;
                m += 15;
            }
        }

        System.out.println(h + " " + m);
    }
}
