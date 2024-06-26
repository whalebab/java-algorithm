package Bronze4.Day14;

import java.util.Scanner;

// 다시 도전 필요!!

public class BOJ11945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        if (M > 0) {
            for (int i = 0; i < N; i++) {
                char[] text = sc.next().toCharArray();
                for (int j = M-1; j >= 0; j--) { // 문자열 거꾸로 탐색
                    System.out.print(text[j]);
                }
                System.out.println();
            }
        }
    }
}
