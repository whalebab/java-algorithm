package Bronze5.Day19;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = sc.nextInt();

        char c = str.charAt(--i);
        System.out.println(c);
    }
}
