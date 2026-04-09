package study.ch22.ex;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex03 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3, 7, 2, 9, 4, 11, 6);

        System.out.println((stream.filter(s -> s > 5)).map(s -> s * 3).toList());
    }
}
