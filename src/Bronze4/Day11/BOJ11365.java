package Bronze4.Day11;

import java.util.Scanner;

public class BOJ11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String str = sc.nextLine();
            char[] textArr = str.toCharArray();
            if (str.equals("END")) break;
            for (int i = textArr.length - 1; i >=0; i--) { // 뒤에서 부터 탐색
                System.out.print(textArr[i]);
            }
            System.out.println();
        }
    }
}
