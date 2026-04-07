package study.ch19;

import javax.swing.text.html.parser.Entity;
import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        //mapping
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "aaa");
        userMap.put(2, "bbb");
        userMap.put(3477, "ccc");
        userMap.put(44544, "ddd");//{1=ddd} -> 덮어씌워졌다
        System.out.println(userMap.get(2));

//        List<Map.Entry<Integer, String>> userEntrys = new ArrayList<>(userMap.entrySet()); //엔트리마다 순서가 있는것
//        System.out.println(userEntrys.get(0));
        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}
