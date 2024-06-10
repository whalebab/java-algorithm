package Bronze4.Day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] arr = new Integer[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        Arrays.sort(arr);
        //Arrays.sort(arr, Collections.reverseOrder()); // 내림차순
        System.out.println(arr[0] +" " + arr[1] + " " + arr[2]);
    }
}
