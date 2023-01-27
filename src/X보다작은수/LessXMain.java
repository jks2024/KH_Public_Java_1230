package X보다작은수;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 첫째줄에 N과 X가 주어짐
// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다.
// 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
// 10 5 => 배열의 갯수와 찾을 수를 연속해서 입력
// 1 10 4 9 2 3 8 5 7 6
// 결과 값 : 1 4 2 3
public class LessXMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 배열의 갯수
        int x = sc.nextInt(); // 주어진 수
//        int[] arr = new int[n];
//        for(int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt(); // 주어진 n 만큼의 수를 입력 받음
//            if(arr[i] < x) System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            list.add(sc.nextInt());
            if(list.get(i) < x) System.out.print(list.get(i) + " ");
        }
    }
}
