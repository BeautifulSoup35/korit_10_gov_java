package study.ch22;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamda02 {
    public static void main(String[] args) {
        class R implements Runnable {
            @Override
            public void run() {

            }
        }

        Runnable r = () -> {};//실행문에 쓰인다 like main
        r.run();
        Consumer<String> c1 = s -> System.out.println(s);
        Consumer<List<Integer>> c2 = numList -> {
            for(Integer i : numList){
                System.out.print(" "+i);
            }
        };

        c2.accept(List.of(10, 20, 30, 40));
        c1.accept("권민주");
        r.run();

        Supplier<Character> s1 = () -> {// 코드안에서 람다식은 정의하며 구현한다
            System.out.println("Supplier 객체 호출");
            return 'c';
        };

        Supplier<Character> s2 = () -> "abch".charAt(0);

        String name = "권민주";//전역
        Supplier<Character> s3 = () -> {
            System.out.println(name);
            return name.charAt(0);
        };//class정의가 밖에서가 아니라 class안에서 이루어지니 전역변수 사용가능하다
        System.out.println(s2.get());

        Function<String, Integer> parser = strData -> {
            Integer numData = Integer.parseInt(strData);//문자열이 매개수로 들어와 int로 바꾸기
            return numData;
        };

        System.out.println(parser.apply("1000") + 200);
        Predicate<String> p = n -> {
            return "권민주".equals(n);
        };

        System.out.println(p.test("권민주"));
    }




}
