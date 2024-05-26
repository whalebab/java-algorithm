package Day9;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // sc.hasNext(): 다음에 받을 수가 있는지 체크
        while (sc.hasNext()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
        }
    }
}
