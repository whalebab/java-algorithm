package Bronze4.Day20;

import java.util.Scanner;

public class BOJ14489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // A 잔고
        int B = sc.nextInt(); // B 잔고
        int C = sc.nextInt(); // 치킨 한마리의 가격

        // 치킨을 살 수 있을 때
        if (A + B >= (C * 2)) {
            System.out.println((A + B) - (C * 2));
        } else {
            // 치킨을 살 수 없을 때
            System.out.println(A + B);
        }
    }
}
