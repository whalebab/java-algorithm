package Bronze5.Day8;

import java.util.Scanner;

public class BOJ10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0) {
                break;
            }
            System.out.println(A + B);
        }
    }
}
