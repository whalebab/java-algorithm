package Bronze5.Day15;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int temp = sc.nextInt();
            sum += temp * temp;
        }
        int result = sum % 10;
        System.out.println(result);
    }
}
