package 문자열추가;
// 2개의 문자열을 입력 받고, 정수 n값을 입력 받음
// 첫번째 문자열 입력 : seoul
// 두번째 문자열 입력 : korea
// 정수값 입력 : 2
// ulkorea
// 첫번째 문자열의 뒤 부분의 n개의 문자를 두번째 문자열 앞에 끼워 넣는 코드 작성
// 힌트 : substring 사용해야하고, substring 이용해서 문자열를 추출할때 사용되는 인덱스를 미리 구해야 함(아이디어가 필요)
import java.util.Scanner;

public class StringAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 문자열 입력 : ");
        String frtStr = sc.next();
        System.out.print("두번째 문자열 입력 : ");
        String secStr = sc.next();
        System.out.print("정수 입력 : ");
        int n = sc.nextInt();
        int pos = frtStr.length() - n;
        String sub = frtStr.substring(pos);
        System.out.println(sub + secStr);



    }
}
