package 문자열자르기;
import java.util.Scanner;
//  시간 입력 : 23:30:59 => 오후 11시 30분 59초
//  시간 입력 : 11:3:1 => 오전 11시 03분 01초
public class StringSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력 : ");
        String times = sc.next();
        String[] splitTime = times.split(":");
        String min = "";
        String sec = "";
        String amPm = "";

        int intHour = Integer.parseInt(splitTime[0]);
        if(intHour > 11) {
            amPm = "오후";
            intHour -= 12;
        } else {
            amPm = "오전";
        }

        if(splitTime[1].length() == 1) min = "0" + splitTime[1];
        else min = splitTime[1];
        if(splitTime[2].length() == 1) sec = "0" + splitTime[2];
        else sec = splitTime[2];

        if(intHour >= 10)
            System.out.println(amPm + " " + intHour + "시 " + min + "분 " + sec + "초");
        else
            System.out.println(amPm + " 0" + intHour + "시 " + min + "분 " + sec + "초");
    }
}
