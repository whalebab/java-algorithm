package Bronze3.Day1;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        char[] second = sc.next().toCharArray();

        int sum = 0;
        int su = 1;
        for (int i = 2; i >= 0; i--) { // 뒷자리부터 곱해야하기 때문에 for문 뒤에서 탐색
            int temp = Integer.parseInt(String.valueOf(second[i]));
            System.out.println(first * temp);
            sum += (first * temp) * su;
            su = su * 10;
        }
        System.out.println(sum);
    }
}
