package 블랙잭;
// 5 25 => 카드 장수, 주어진 값
// 5 6 7 8 9 => 3장의 카드를 골라서 주어진 값과 제일 가까운 값을 찾는 것(주어진 값을 넘어가면 안됨)
import java.util.Scanner;

public class BlackJackEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // 3장의 카드 합
        int rst = 0; // 결과 값
        System.out.print("카드 숫자 : ");
        int cnt = sc.nextInt();
        System.out.print("주어진 값 : ");
        int m = sc.nextInt();
        int[] arr = new int[cnt];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < cnt; i++) {
            for(int j = i+1; j < cnt; j++) {
                for(int k = j+1; k < cnt; k++) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m && rst < sum) rst = sum;
                }
            }
        }
        System.out.println("결과 : " + rst);
    }
}
