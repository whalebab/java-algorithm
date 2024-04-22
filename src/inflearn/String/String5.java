/*
5. 특정 문자 뒤집기
설명

영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

예시 입력 1
a#b!GE*T@S

예시 출력 1
S#T!EG*b@a

*/

package inflearn.String;
import java.util.Scanner;

public class String5 {
    public static String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray(); // String를 기반으로 한 문자배열이 만들어져서 s에 들어감

        // ※ lt: left, rt: right
        int lt = 0; // s 배열의 0번 인덱스
        int rt = str.length() - 1; // s 배열의 끝 인덱스

        // 첫번째 문자와 끝 문자를 교환(바꾸는)하는 로직
        // while문을 돌때 lt는 하나씩 증가, rt는 하나씩 감소
        // 이유: lt는 값이 하나씩 증가해서 오른쪽의 값을 읽고 rt는 값이 하나씩 감소해서 왼쪽의 값을 읽음, 이때 하나씩 값을 증가, 감소해서 값을 비교함

        // --> ++                          -- <--
        // ex) lt                          rt
        //      a  #  b  !  G  E  *  T  @  S

        //         lt                   rt
        //      S  #  b  !  G  E  *  T  @  a

        while (lt < rt) {
            // s의 lt가 알파벳이 아닐때
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                // swap (버블정렬)
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }

        answer = String.valueOf(s); // s라는 기본형 데이터의 배열을 String화 시킴

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(solution(str));
    }
}
