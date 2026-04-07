package study.ch20.ex;

import java.util.*;

//["apple", "banana", "apple", "orange", "banana", "apple"]
public class Ex01 {
    public static void main(String[] args) {
        List<String> listFruit = List.of ("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Integer> fruit = new HashMap<>();
        int count = 1;
        for(String str : listFruit){
            if(!fruit.containsKey(str)){
                fruit.put(str, count);
                continue;
            }
            fruit.replace(str, fruit.get(str) + 1);
        }
        System.out.println(fruit);

    }
}
