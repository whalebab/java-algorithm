package Bronze5.Day16;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger sum = A.add(B);
        System.out.println(sum.toString());
    }
}
