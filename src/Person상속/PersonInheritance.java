package Person상속;
// 인간(Person) 클래스 만들기
//  - age (정수값 : 나이) : 필드와 세터/게터
//  - sleep (정수값 : 시간) : 필드와 세터/게터
// 인간의 특성을 상속 받아 직장인 만들기
// - work (정수값 : 일하는 시간) : 필드와 세터/게터
// 인가의 특성을 상속 받아 학생 만들기
// - study (열심히/적당히/놀면서) : 필드와 세터/게터
public class PersonInheritance {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setWork(12);
        worker.setAge(30);
        worker.setSleep(6);
        System.out.println("직장인이 " + worker.getWork() + "시간 동안 일을 합니다.");
        System.out.println("직장인의 나이는 " + worker.getAge() + "입니다.");
        System.out.println("직장인은 " + worker.getSleep() + "시간 동안 잠을 잡니다.");

        Student student = new Student();
        student.setStudy(3); // 1/2/3
        student.setAge(18);
        student.setSleep(8);
        System.out.println("학생이 " + student.getStudy() + " 공부 합니다.");
        System.out.println("학생의 나이는 " + student.getAge() + "입니다.");
        System.out.println("학생은 " + student.getSleep() + "시간 동안 잠을 잡니다.");
    }
}
