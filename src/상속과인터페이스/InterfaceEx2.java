package 상속과인터페이스;
import java.util.Scanner;
// 상속과 인터페이스 함께 사용 하기
public class InterfaceEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연결할 네트워크를 선택 [1]WiFi [2]5G : ");
        int num = sc.nextInt();
        if(num == 1) {
            WiFi wifi = new WiFi("KT ", "고유림");
            wifi.connect();
            wifi.sendMsg();
            wifi.rcvMsg();
        } else {
            FiveG fiveG = new FiveG("SK ", "나희도");
            fiveG.connect();
            fiveG.sendMsg();
            fiveG.rcvMsg();
        }
    }
}
