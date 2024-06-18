package Bronze4.Day9;

import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args) {
        // 첫째 줄: 1m당 사람의 수 L / 파티가 열련던 곳의 넓이 P
        // 둘째 줄: 각 기사에 실려있는 참가자의 수

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int L = sc.nextInt();
        int P = sc.nextInt();


        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            int result = num[i] - (L * P);
            System.out.print(result + " ");
        }
    }
}
