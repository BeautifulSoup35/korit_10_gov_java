package study.ch19.ex;

import java.util.*;

public class Ex05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("사과", "바나나", "포도", "딸기"));
        List<String> fruit = new ArrayList<>();
        fruit.addAll(list);

        fruit.add(fruit.indexOf("포도"), "망고");
        fruit.remove("포도");

        int index = fruit.indexOf("포도");
        fruit.set(index, "망고");
        fruit.add(0, "체리");
        fruit.remove("딸기");

        System.out.println(fruit);

    }
}
