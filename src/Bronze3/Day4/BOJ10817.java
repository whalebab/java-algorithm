package Bronze3.Day4;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[3];
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        A[2] = sc.nextInt();

        Arrays.sort(A); // 배열 오름차순 정렬
        System.out.println(A[1]);
    }
}
