package 알람설정하기;
// 상근이라는 친구가 있는데, 이친구는 매일 학교를 지각을 합니다.
// 창영이라는 지각하지 않는 방법을 알려 줍니다.
// 알람을 설정하면 자동으로 설정 시간보다 45분 일찍 되도록 함.
// 시간은 24시간제
// 입력 시간은 시간과 분으로 입력 받기 (5시 30분) -> 4시45분

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        // 키보드 입력을 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 시간과 분을 정수값으로 입력 받음
        System.out.print("시간 입력 : ");
        int hour = sc.nextInt();
        System.out.print("분 입력 : ");
        int min = sc.nextInt();
        // 시간을 모두 분으로 일단 변환 후 계산이 필요
        int calc = (hour * 60) + min;
        // 한가지 더 고려해야 될 사항은 45분을 뺀 결과가 0보다 작은 경우에 대해서 고려 필요
        if(calc < 45) {
            calc = (24 * 60) + min;
        }
        calc -= 45;
        // 분으로 변경된 값에서 45을 빼고 결과를 시간과 분으로 환산해서 결과 출력
        System.out.printf("%d시%d분\n", (calc / 60), (calc % 60));
    }
}
