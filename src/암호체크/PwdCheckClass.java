package 암호체크;
// 암호의 길이는 10 ~ 30자 사이 (10 <= len <= 30)
// 암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
// 특수문자는 (!, %, _, #, &, +, -, *, /)의 9개 중의 하나
// 입력 받은 패스워드가 조건을 만족하면 "Good password", 만족하지 않으면 "Bad password"출력
// 반복문을 사용하고 사용자가 "종료 또는 "exit"를 입력하면 프로그램 종료
public class PwdCheckClass {
    // 길이 체크 메소드
    boolean validLength(String pwd) {
        if(pwd.length() >= 10 && pwd.length() <= 30) return true;
        return false;
    }
    // 숫자 체크
    boolean validNumber(String pwd) {
        for(int i = 0; i < pwd.length(); i++) {
            if(pwd.charAt(i) >= '0' && pwd.charAt(i) <= '9') return true;
        }
        return false;
    }
    // 소문자 체크
    boolean validLowerAlphabet(String pwd) {
        for(int i = 0; i < pwd.length(); i++) {
            if(pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z') return true;
        }
        return false;
    }
    // 대문자 체크
    boolean validUpperAlphabet(String pwd) {
        for(int i = 0; i < pwd.length(); i++) {
            if(pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') return true;
        }
        return false;
    }
    boolean validRex(String pwd) {
        String specialLetter = "!%_&#+-*/";
        for(int i = 0; i < specialLetter.length();i++) {
            for(int j = 0; j < pwd.length(); j++) {
                if(specialLetter.charAt(i) == pwd.charAt(j)) return true;
            }
        }
        return false;
    }
}
