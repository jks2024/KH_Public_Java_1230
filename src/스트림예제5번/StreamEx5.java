package 스트림예제5번;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
// 파일로 부터 스트림 읽기
public class StreamEx5 {
    public static void main(String[] args) throws IOException {
        // 파일 내용을 소스로 하는 스트림
        Path path = Paths.get("src/스트림예제5번/chicken.txt");
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();

        // BufferedReader의 Line() 메소드 이용
        File file = path.toFile();
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        stream = br.lines();
        stream.forEach(System.out::println);
    }
}
