package 은행만들기;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
    public static String getCurrentDate(String fmt) {
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
    final static String KH_SERVER_DOMAIN = "192.168.30.34";
    final static String KAKAO_DOMAIN = "192.45.66.77";
    final static String API_HEADER = "http://kh_ggg";


}
