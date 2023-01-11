package 홀수짝수나누어담기;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 999를 입력하면 그만 받음
public class EvenOddArray {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    void inputValue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int value = 0;
        while(true) {
            value = sc.nextInt();
            if(value == 999) break;
            inList.add(value);
        }
    }
    void separateValue() {
        for(int e : inList) {
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void displayValue() {
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        for(int e : evenList) System.out.print(e + " ");
    }
}
