package study.ch22.ex;

import java.util.stream.Stream;

public class Ex02 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        System.out.println(stream.map(s -> s * s).toList());
    }
}
