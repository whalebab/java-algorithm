package Bronze3.Day5;

import java.util.Scanner;

public class BOJ1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int min = x;
        if (min > y) min = y;
        if (min > h - y) min = h-y;
        if (min > w - x) min = w-x;
        System.out.println(min);
    }
}
