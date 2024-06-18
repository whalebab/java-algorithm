package Bronze4.Day9;

import java.util.Scanner;

public class BOJ10156 {
    public static void main(String[] args) {
        // 과자 한개의 가격 K
        // 과자의 개수 N
        // 현재 가진 돈의 액수 M
        // K N M => 부모님께 받아야하는 돈의 액수 출력
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = Math.abs((K * N) - M);
        if ((K * N) < M) {
            result = 0;
        }

        System.out.println(result);
    }
}