package study.ch22.ex;

import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 12, 3, 8, 20, 1);

        System.out.println(stream.filter(m -> m >= 10).toList());

    }
}
