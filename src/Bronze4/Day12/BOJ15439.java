package Bronze4.Day12;

import java.util.Scanner;

public class BOJ15439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            result = i * N;
        }

        System.out.println(result);
    }
}
