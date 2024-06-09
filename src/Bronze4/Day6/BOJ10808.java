package Bronze4.Day6;

import java.util.Scanner;

public class BOJ10808 {
    public static void main(String[] args) {
        //System.out.println((int)'a'); // 97

        Scanner sc = new Scanner(System.in);
        int[] result = new int[26]; // 알파벳 갯수 배열

        char[] temp = sc.next().toCharArray();
        for (int i = 0; i < temp.length; i++) {
            result[temp[i]-97]++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
