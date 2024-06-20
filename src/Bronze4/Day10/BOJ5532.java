package Bronze4.Day10;

import java.util.Scanner;

public class BOJ5532 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 방학 일수
        int A = sc.nextInt(); // 국어 총 페이지
        int B = sc.nextInt(); // 수학 총 페이지
        int C = sc.nextInt(); // 하루에 국어를 최대로 풀 페이지
        int D = sc.nextInt(); // 하루에 수학를 최대로 풀 페이지

        int result = A / C;
        if (A % C != 0) {
            result++;
        }

        int result2 = B / D;
        if (B % D != 0) {
            result2++;
        }
        System.out.println(L - Math.max(result, result2));
    }
}
