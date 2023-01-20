package 자동차종합예제;
import java.util.Scanner;

public class CarTotalMain {
    public static void main(String[] args) {
        final int[] dist = {0, 400, 150, 200, 300};
        Car car = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("이동 지역 선택 [1]부산 [2]대전 [3]강릉 [4] 광주 : ");
        int city = sc.nextInt();
        System.out.print("이동할 승객 수 입력 : ");
        int passCnt = sc.nextInt();
        System.out.print("이동할 차량 선택 [1]스포츠카 [2]승용차 [3]버스 : ");
        int carSel = sc.nextInt();
        System.out.print("부가 기능 [1]ON [2]OFF : ");
        int option = sc.nextInt();
        boolean isMode = (option == 1) ? true : false;
        switch (carSel) {
            case 1 : car = new SportsCar("Ferrari"); break;
            case 2 : car = new Sedan("GV80"); break;
            case 3 : car = new Bus("관광버스"); break;
            default: System.out.println("차량 선택이 잘 못 되었습니다.");
        }
        car.setMode(isMode);
        int moveCnt = car.getMovingCnt(passCnt); // 승객의 수를 입력 받아 이동 횟수를 구함
        System.out.println("====== " + car.getName() + " ======");
        System.out.println("총 비용 : " + car.getTotalCost(dist[city], moveCnt) + "원");
        System.out.println("총 주유 횟수 : " + car.getRefuelCnt(dist[city], moveCnt) + "회");
        System.out.printf("총 이동 시간 : %.2f\n", car.getMovingTime(dist[city], moveCnt));
    }
}
