package 영화표예매;

import 메소드기본.SampleMethod;

import java.util.Scanner;

// 영화표예매 관련 클래스를 만들고 객첵 생성
// 영화표 좌석 정보 표시를 위해 배열 생성
// 예매하기와 종료하기 메뉴 만들기
// 종료하기를 누르면 현재까지 판매된 좌석의 총 금액을 구함.
// 극장의 좌석은 10개
// 각 좌석당 판매 가격은 12000원
public class MovieTicket {
    public static void main(String[] args) {
        MovieSell movieSell = new MovieSell();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("[1]예매하기");
            System.out.println("[2]종료하기");
            int selMenu = sc.nextInt();
            if(selMenu == 1) movieSell.selectSeat();
            else {
                System.out.println("총 판매 금액 : " + movieSell.totalAmount());
                break;
            }
        }
    }
}
