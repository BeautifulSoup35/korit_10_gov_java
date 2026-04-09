package study.ch22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of());
        Stream<Integer> numStream = Stream.of(10, 20, 30);
        Stream<Integer> numStream2 = numStream.map(num -> num * 10);
        System.out.println(numStream2.toList());
    }
}
