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
import java.util.Scanner;

public class String3_1 {

    public static String solution(String str) {
        String answer = "";
        int min = Integer.MIN_VALUE, pos;

        // 공백 문자를 발견하지 못하면 -1 리턴
        // 공백 문자를 발견하면 인덱스 번호 리턴
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos); // pos가 가리키는 곳은 공백 문자
            int len = tmp.length();

            if (len > min) {
                min = len;
                answer = tmp;
            }
            str = str.substring(pos + 1); // 첫번째 공백문자 찾은 후 계속해서 뒤에있는 공백문자 찾기
        }

        if (str.length() > min) answer = str; // 마지막 단어 적용시키기 (study 뒤에는 공백이 없기 때문에 while문 조건에 의해 -1로 종료됨)

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(solution(str));
    }
}
