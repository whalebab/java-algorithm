package Bronze4.Day5;

import java.util.Scanner;

public class BOJ10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        if (a < 40) a = 40;

        int b = sc.nextInt();
        if (b < 40) b = 40;

        int c = sc.nextInt();
        if (c < 40) c = 40;

        int d = sc.nextInt();
        if (d < 40) d = 40;

        int e = sc.nextInt();
        if (e < 40) e = 40;

        int sum = (a + b + c + d + e) / 5;

        System.out.println(sum);
    }
}
