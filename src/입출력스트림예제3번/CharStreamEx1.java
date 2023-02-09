package 입출력스트림예제3번;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
// Writer 는 문자 스트림의 최상위 클래스 입니다.
public class CharStreamEx1 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("test.txt"); // 문자로 기록되기 때문에 파일을 열어 볼 수 있음
        //char[] data = "일타스캔들 대행사".toCharArray(); // 문자열을 문자 배열로 변환
        String data = "일타스캔들 대행사 미스터썬샤인";
        writer.write(data);
//        for(int i = 0; i < data.length; i++) {
//            writer.write(data[i]); // 문자를 파일에 write(int c)
//        }
//        writer.write(data);  // write(char[] c)


        writer.flush(); // write() 이후에는 반드시 버퍼를 비워야 함
        writer.close(); // 스트림 닫기 및 자원 반납
    }
}
