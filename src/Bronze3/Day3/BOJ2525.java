package Bronze3.Day3;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        B += C;
        if (B > 59) {
            A = (A + B/60) % 24;
            B = B % 60;
        }

        System.out.println(A + " " + B);
    }
}
