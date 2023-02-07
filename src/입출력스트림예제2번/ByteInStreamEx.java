package 입출력스트림예제2번;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
// InputStream : 바이트 기반 입력 스트림의 최상위 추상 클래스 입니다.
// FileInputStream, BufferedInputStream, DataInputStream
// close() : 스트림을 닫음
// read() : 스트림에서 1바이트을 읽음(0 ~ 255 아스키코드값), 더 이상 읽을 데이터가 없으면 -1 반환
// available() : 현재 읽을 수 있는 바이트 수를 반환
public class ByteInStreamEx {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("test0207.db");
//        while(true) {
//            int data = is.read(); // 1 바이트씩 읽기
//            if(data == -1) break; // 더 이상 읽을 데이터가 없음
//            System.out.println(data);
//        }
//        byte[] buffer = new byte[100];
//        while(true) {
//            int byteNum = is.read(buffer); // 배열의 길이 만큼 읽기
//            if(byteNum == -1) break;
//            for(int  i = 0; i < byteNum; i++) {
//                System.out.println(buffer[i]);
//            }
//        }
        byte[] buffer = new byte[5];
        int byteNum = is.read(buffer, 2, 3);
        if(byteNum != -1) {
            for(int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}
