package 다중For문;
import java.util.Scanner;
// 별찍기 응용
// 정수 입력 받기 : 4
// *
// * *
// * * *
// * * * *
public class DoubleFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("정수 입력 : ");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
