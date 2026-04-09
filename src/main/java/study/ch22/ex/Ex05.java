package study.ch22.ex;

import java.util.*;

class Person {
    private String name;
    private
}
public class Ex05 {
    public static void main(String[] args) {
        List<Map<String, Object>> people = List.of(
                Map.of("name", "김자바", "age", 25),
                Map.of("name", "이파이", "age", 30),
                Map.of("name", "박고랭", "age", 22)
        );

        System.out.println(people.stream().map(s -> s.));
    }
}
