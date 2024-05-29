package Bronze5.Day5;

import java.util.Scanner;

public class BOJ2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if ((month % 4 == 0) && !(month % 100 == 0) || (month % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
