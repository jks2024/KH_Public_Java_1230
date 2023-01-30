package 클래스정렬1;

public class CarEx implements Comparable<CarEx>{
    public String modelName;
    public int modelYear;
    public String color;

    public CarEx(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarEx o) {
//        if(this.modelYear == o.modelYear) { // 차의 연식이 같으면
//            return this.modelName.compareTo(o.modelName); // 이름을 기분으로 사전순 정렬
//        } else if(this.modelYear < o.modelYear) return -1;
//        else return 1;
        return this.color.compareTo(o.color);
    }
}
