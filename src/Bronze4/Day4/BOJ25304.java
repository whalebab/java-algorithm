package Bronze4.Day4;

import java.util.Scanner;

public class BOJ25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong(); // 영수증에 적힌 총 금액
        int n = sc.nextInt(); // 영수증에 적힌 구매한 물건의 종류의 수
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int temp_amount = sc.nextInt();
            int temp_num = sc.nextInt();
            sum += temp_amount * temp_num;
        }
        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
