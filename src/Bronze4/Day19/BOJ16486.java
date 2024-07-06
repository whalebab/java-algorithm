package Bronze4.Day19;

import java.util.Scanner;

public class BOJ16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt(); // C의 가로의 길이
        int d2 = sc.nextInt(); // A의 반지름의 길이

        double pie = 3.141592;

        System.out.println(d1 * 2 + 2 * pie * d2);
    }
}
