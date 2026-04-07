package study.ch20.ex;
//두 개의 Map이 주어질 때, 같은 key를 가진 값들을 더해서 새로운 Map을 만드세요.
//
//map1 = {a=1, b=2}
//map2 = {b=3, c=4}

import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>(Map.of(
                'a',1,
                'b',2
        ));
        Map<Character, Integer> map2 = new HashMap<>(Map.of(
                'b', 3,
                'c', 4
        ));

        Map<Character, Integer> result = new HashMap<>();

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!result.containsKey(entry.getKey())) {//값이 없을때
                result.put(entry.getKey(), entry.getValue());
                continue;
            }
            result.put(entry.getKey(), result.get(entry.getKey()) + entry.getValue());
        }

        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if (!result.containsKey(entry.getKey())) {//값이 없을때
                result.put(entry.getKey(), entry.getValue());
                continue;
            }
            result.put(entry.getKey(), result.get(entry.getKey()) + entry.getValue());
        }
        System.out.println(result);
    }
}
