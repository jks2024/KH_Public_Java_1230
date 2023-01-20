package 중첩인터페이스;
import java.util.*;

// 중첩 인터페이스는 클래스 내부에 선언한 인터페이스 입니다.
// 중첩 인터페이스는 주로 UI 프로그래밍레서 사용 됩니다.
public class NestedInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date date = new Date();
        Button button = new Button();
        button.setOnClickListener(new CallListener());
        button.touch();
        button.setOnClickListener(new MessageListener());
        button.touch();
    }
}
