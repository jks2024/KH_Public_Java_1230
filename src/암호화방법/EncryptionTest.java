package 암호화방법;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EncryptionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal = sc.nextLine();
        System.out.print("암호문 : ");
        String encrypt = sc.next();
        char[] enc = encrypt.toCharArray(); // 입력 받은 문자열 문자 배열로 변경
        char value = 0;
        List<Character> vig = new ArrayList<>();

        for(int i = 0; i < normal.length(); i++) {
            if(normal.charAt(i) == ' ') vig.add(' '); // 공백인 경우 공백 처리
            else {
                value = (char) (normal.charAt(i) - (enc[i % encrypt.length()] - 'a') - 1);
                if(value < 'a') value += 26;
                vig.add(value);
            }
        }
        for(Character e : vig) System.out.print(e);
    }
}
