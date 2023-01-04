package 성적에대한등급;
import java.util.Scanner;
// 성적을 입력 받음
// 입력 받은 성적이 0 ~ 100사이가 아니면 "성적을 잘못 입력 하였습니다"라고 출력
// 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 나머지는 F로 출력
public class ScoreGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력 하세요 : ");
        int score = sc.nextInt();

        if(score < 0 || score > 100) {
            System.out.println("성적을 잘못 입력 하였습니다");
            return;
        }

        if(score >= 90) System.out.println("A");
        else if(score >= 80) System.out.println("B");
        else if(score >= 70) System.out.println("C");
        else if(score >= 60) System.out.println("D");
        else System.out.println("F");

    }
}
