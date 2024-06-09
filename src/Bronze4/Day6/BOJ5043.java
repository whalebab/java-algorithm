package Bronze4.Day6;

import java.util.Scanner;

public class BOJ5043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 상덕버거
        int b = sc.nextInt(); // 중덕버거
        int c = sc.nextInt(); // 하덕버거
        int min_set = Math.min(a,Math.min(b, c));

        int d = sc.nextInt(); // 콜라
        int e = sc.nextInt(); // 사이다

        int min_side = Math.min(d, e);

        System.out.println(min_set + min_side - 50);
    }
}
