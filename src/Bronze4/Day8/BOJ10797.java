package Bronze4.Day8;

import java.util.Scanner;

public class BOJ10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (check == sc.nextInt()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
