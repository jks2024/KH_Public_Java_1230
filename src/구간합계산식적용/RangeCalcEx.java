package 구간합계산식적용;
import java.util.Scanner;

public class RangeCalcEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 개수 입력 : ");
        int n = sc.nextInt();
        System.out.print("테스트 케이스 개수 : ");
        int x = sc.nextInt();
        int[] arr = new int[n];
        long[] sumArr = new long[n];
        System.out.print("배열 요소 입력 : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(i == 0) sumArr[i] = arr[i];
            else sumArr[i] = sumArr[i-1] + arr[i]; // s[i] = s[i-1] + a[i];
        }
        int left = 0, right = 0;
        while(x != 0) {
            System.out.print("범위 입력 : ");
            left = sc.nextInt();
            right = sc.nextInt();
            if(left != 1) System.out.println(sumArr[right - 1] - sumArr[left - 2]);
            else System.out.println(sumArr[right - 1] - 0);
            x--;
        }
    }
}
