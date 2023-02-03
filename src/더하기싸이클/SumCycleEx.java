package 더하기싸이클;
import java.util.Scanner;
// 원래 자리로 돌아오는 회수 구하기
// 26값을 입력 받으면 새로운 68(2+6 = 8(sumNumber) =>
// 입력 받은 수의 일의 자리와 합으로 만들어진 수의 일의 자리로 새로운 만들기
// 요기까지가 1 cycle
// 6+8 = 14 => 84
// 2 cycle
// 8 + 4 = 12 =>42
// 3 cycle
// 4 + 2 = 6 => 26
public class SumCycleEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumNumber = 0; // 더하는 수
        int newNumber = 0; // 새로 만들어진 수
        int cnt = 0;
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int num = input; //  입력값을 순회용 num값을 대입함
        while (true) {
            sumNumber = (num / 10) + (num % 10); // 입력값으로 10의 자리 + 1의 자리로 변환
            newNumber = ((num % 10) * 10) + (sumNumber % 10); // 입력값의 1의자리 + 계산된값의 1의자리를 더함
            cnt++; // 사이클 횟수를 1증가 시킴
            if(newNumber == input) break; // 입력값과 새로운 숫자가 동일하지 확인
            num = newNumber; // 새로운 숫자를 순회용 num에 대입
        }
        System.out.println(cnt);
    }
}
