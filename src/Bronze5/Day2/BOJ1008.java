package Bronze5.Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        System.out.println(A / B);

        // float double -> ※ 정밀도 차이가 있음
        // float -> 소수점 6~7자리 정도까지 표현이 가능
        // double -> 소수점 15~16자리 정도까지 표현이 가능

        //TODO 코테에서는 왠만하면 float보다 double를 쓰는게 좋음
    }
}
