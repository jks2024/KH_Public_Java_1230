package 피나고라스정리;
import java.util.Arrays;
import java.util.Scanner;

public class PythagoreanEx {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        while(true) {
            int sum = 0;
            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            if(sum == 0) break;
            Arrays.sort(arr);
            if((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
                System.out.println("right");
            } else System.out.println("wrong");
        }
    }
}
