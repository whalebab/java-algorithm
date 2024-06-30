package Bronze4.Day15;

import java.util.Scanner;

public class BOJ24723 {
    public static void main(String[] args) {

        // N (N-1) * 2; -> 점화식
        // 현재 층의 모든 경우의 수는 바로 이전 층의 경우의 수 * 2

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = {1, 2, 4, 8, 16, 32};
        System.out.println(A[N]);
    }
}
