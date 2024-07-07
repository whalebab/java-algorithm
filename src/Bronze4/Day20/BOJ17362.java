package Bronze4.Day20;

import java.util.Scanner;

public class BOJ17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 8 == 0) {
            System.out.println(2);
        } else if (n % 4 == 3) {
            System.out.println(3);
        } else if (n % 8 == 6) {
            System.out.println(4);
        } else {
            System.out.println(n % 8);
        }
    }
}
