package 중복없는로또번호생성;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// 1. 6개의 로또 번호 생성해서 출력하기 (배열 사용) : 1~45 사이의 6개 숫자
// 2. 중복 없는 로또 번호 생성 후 출력
// 3. ArrayList 사용해서 출력 (중복 없음)
// 4. Set을 이용해서 로또 번호 출력 (중복 없음)
public class LottoEx1 {
    public static void main(String[] args) {
        List<Integer> lotto = new Vector<>();
        int tmp;
        while(true) {
            tmp = (int)((Math.random() * 45) + 1);
            if(!lotto.contains(tmp)) lotto.add(tmp);
            if(lotto.size() == 6) break;
        }
        System.out.println(lotto);
    }
}
