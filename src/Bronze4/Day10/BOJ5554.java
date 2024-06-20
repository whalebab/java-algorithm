package Bronze4.Day10;

import java.util.Scanner;

public class BOJ5554 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int s1 = sc.nextInt(); // 집 -> 학교까지 이동시간 (초)
//        int s2 = sc.nextInt(); // 학교 -> PC방까지 이동시간 (초)
//        int s3 = sc.nextInt(); // PC방 -> 학원까지 이동시간 (초)
//        int s4 = sc.nextInt(); // 학원 -> 집까지 이동시간 (초)
//
//        int newS5 = (s1 + s2 + s3 + s4) % 60; // 초
//        int newM = (s1 + s2 + s3 + s4) / 60; // 분
//        System.out.println(newM);
//        System.out.println(newS5);

        int s = 0;
        for (int i = 0; i < 4; i++) {
            s += sc.nextInt();
        }
        System.out.println(s/60);
        System.out.println(s%60);
    }
}
