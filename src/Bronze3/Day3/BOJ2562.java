package Bronze3.Day3;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // max 값 초기화
        int min = Integer.MAX_VALUE; // min 값 초기화

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (temp > max) max = temp;
            if (temp < min) min = temp;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
