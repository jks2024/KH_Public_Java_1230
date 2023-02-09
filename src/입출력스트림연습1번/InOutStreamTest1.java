package 입출력스트림연습1번;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;
// 파일을 읽어서 총점을 구하고 총점이 높은 사람 순으로 정렬(종점이 같은 경우 이름순 정렬)
public class InOutStreamTest1 {
    public static void main(String[] args) throws IOException {
        FileInputStream is = null;
        TreeSet<StudentInfo> ts = new TreeSet<>();
        try {
           is = new FileInputStream("src/입출력스트림연습1번/score.txt");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(is);

        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] strArr = line.split(" ");
            ts.add(new StudentInfo(strArr[0],
                    Integer.parseInt(strArr[1]),
                    Integer.parseInt(strArr[2]),
                    Integer.parseInt(strArr[3])));
        }
        for(StudentInfo e : ts) {
            System.out.println(e.getName() + " : " + e.getTotal());
        }
        is.close();
    }
}

