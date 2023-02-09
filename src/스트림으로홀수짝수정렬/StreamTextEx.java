package 스트림으로홀수짝수정렬;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 7개의 정수를 입력 받아 홀수 짝수 나누어 출력 하기
// 스트림을 이용해서 하기
public class StreamTextEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("정수 입력 : ");
        for(int i = 0; i < 7; i++) list.add(sc.nextInt());
        System.out.print("홀수 : ");
        list.stream().filter(n->n % 2 != 0).forEach(s->System.out.print(s + " "));
        System.out.println();
        System.out.print("짝수 : ");
        list.stream().filter(n->n % 2 == 0).forEach(s->System.out.print(s + " "));
    }
}
