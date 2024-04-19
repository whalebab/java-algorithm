/*
* 3. 문장 속 단어
설명

한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.

입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.

예시 입력 1
it is time to study

예시 출력 1
study
* */

package inflearn.String;
import java.util.Arrays;
import java.util.Scanner;

public class String3 {

    public static String solution(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE; // 가장 작은값으로 초기화

        // 입력받은 단어를 공백(" ")을 기준으로 잘라서 저장
        String[] blank = str.split(" ");  // blank 변수 안에는 공백(" ")을 기준으로 자른 문자열이 저장됨
                                                // blank: [it, is, time, to, study]

        // 각각 단어의 길이가 최소값보다 크면, 해당 값을 최소값으로 설정하고
        // 해당 단어를 return할 변수에 담는다.
        // ↓ 최대값 구하는 알고리즘
        for (String s : blank) {
            int length = s.length();
            if (length > min) {
                min = length;   // 길이는 더 긴 걸로 바꿔줌
                answer = s;     // 단어 교체
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(solution(str));
    }
}
