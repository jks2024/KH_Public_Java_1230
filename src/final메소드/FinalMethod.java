package final메소드;
// final 키워드 최종 상태라는 의미가 있음
// final 키워드를 클래스, 필드, 메소드 선언 시 사용 가능
public class FinalMethod {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari");
        sportsCar.setTurbo(true);
        sportsCar.infoCar();
        sportsCar.accelerator();
        sportsCar.breakPanel();

        ElectricCar electricCar = new ElectricCar("EV6");
        electricCar.setAutoDrv(true);
        electricCar.infoCar();
    }
}
