package study.ch22.ex;

import java.util.stream.Stream;

public class Ex04 {
    public static void main(String[] args) {
        Stream<String > stream = Stream.of("java", "python", "c++", "javascript", "go");
        System.out.println(stream.map(s -> s.toUpperCase()).filter(s -> s.length() >= 4).toList());
    }
}
