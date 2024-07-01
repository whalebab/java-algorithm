package Bronze4.Day16;

import java.util.Scanner;

public class BOJ17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt(); // 숭실대학교 참여도
        int K = sc.nextInt(); // 고려대학교 참여도
        int H = sc.nextInt(); // 한양대학교 참여도

        // 세 대학교의 참여도 합이 100 이상일 때 "OK"
        // 세 대학교의 참여도 합이 100 이하일 때 가장 낮은 대학교 문자열 표시

        int result = S + K + H;
        if (result >= 100) {
            System.out.println("OK");
        } else if (S < H && S < K) {
            System.out.println("Soongsil");
        } else if (H < S && H < K) {
            System.out.println("Hanyang");
        } else {
            System.out.println("Korea");
        }
    }
}
