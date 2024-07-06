package Bronze4.Day19;

import java.util.Scanner;

public class BOJ4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (B > A) {
            System.out.println("-1");
        } else {
            int X = (A + B) / 2;
            int Y = (A - B) / 2;
            if (X + Y == A && X - Y == B) {
                System.out.print(X + " " + Y);
            } else {
                System.out.println(-1);
            }
        }
    }
}
