package StringKMP;

import java.util.Scanner;

// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력 : Mirko-Slavko
// 출력 : MS
public class StringKMP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String name = sc.next();

        // 첫번째 방법 : split() 메소드를 이용하는 방법
//        String[] splitName = name.split("-"); // "-" 기준으로 문자열을 작은 문자열로 만듬
//        for(String e : splitName) { // 향상된 for문 으로 문자열 배열을 순회 함
//            System.out.print(e.charAt(0)); // 해당 문자열의 0번 인덱스의 문자를 추출
//        }

        // 두번째 방법 : charAt() 메소드를 이용해 대문자만 추출하는 방법
//        for(int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
//                System.out.print(name.charAt(i));
//            }
//        }

        // 세번째 방법 : 0번째 문자를 출력하고, '-'이 후 문자를 출력하는 방법
//        for(int i = 0; i < name.length(); i++) {
//            if(i == 0) System.out.print(name.charAt(i));
//            else { // 하이픈 문자를 만나면, 하이픈 다음에 오는 문자를 출력
//                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
//            }
//        }

        // 네번째 방법 : 문자 배열로 변경 후 출력 하기
        // "Knuth-Morris-Pratt" => 'K', 'n', 'u', 't', '-',
        char[] chName = name.toCharArray();
        for(char e : chName) {
            if(e >= 'A' && e <= 'Z') System.out.print(e);
        }
    }
}

