package Bronze4.Day17;

import java.util.Scanner;

public class BOJ13752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt(); // 히스토그램의 크기
            for (int j = 0; j < k; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
    }
}
