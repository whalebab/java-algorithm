package Bronze4.Day18;

import java.util.Scanner;

public class BOJ5524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String str = sc.next();
            String lowerCase = str.toLowerCase();
            System.out.println(lowerCase);
        }
    }
}
