package 포로퍼티예제2;
import 프로퍼티.PropertiesEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class AppPropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        String path = AppPropertiesEx.class.getResource("../database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));
        properties.setProperty("timeout", "30");
        properties.setProperty("language", "kr");
        properties.setProperty("size", "10");
        properties.setProperty("capacity", "10");

        Member member = new Member();
        member.getMemberProperty();

//        System.out.println("timeout : " + properties.getProperty("timeout"));
//        System.out.println("language : " + properties.getProperty("language"));
//        System.out.println("size : " + properties.getProperty("size"));
//        System.out.println("capacity : " + properties.getProperty("capacity"));

    }
}

class Member {
    public void getMemberProperty() throws IOException {
        Properties properties = new Properties();
        String path = AppPropertiesEx.class.getResource("../database.properties").getPath();
        path = URLDecoder.decode(path, "utf-8");
        properties.load(new FileReader(path));
        System.out.println("timeout : " + properties.getProperty("timeout"));
        System.out.println("language : " + properties.getProperty("language"));
        System.out.println("size : " + properties.getProperty("size"));
        System.out.println("capacity : " + properties.getProperty("capacity"));
    }

}
