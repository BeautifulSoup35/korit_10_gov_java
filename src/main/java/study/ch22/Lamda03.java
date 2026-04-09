package study.ch22;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lamda03 {

    public static String search(List<String> list, Predicate<String> p) {
        for (String s : list) {
            if (p. test(s)) return s;
        }
        return null;
    }


    public static void application(Runnable runnable) {
        System.out.println("프로그램 시작");
        runnable.run();
        System.out.println("프로그램 종료");
    }

    public static List<Integer> createNumListOfRange (int multNum, Function<Integer, List<Integer>> f) {
        return f.apply(multNum);
    }
    public static void main(String[] args) {
        String searchName = "권민";
        List<String> names = List.of("권미","권장","권고");
        String foundName = search(names, name -> name.contains("권"));
        System.out.println(foundName);

        application(()->{//run () 실행
            List<Integer> numList = createNumListOfRange(10, (multNum) -> {//createNumListOfRange(10 , f) 호출
                List<Integer> nums = new ArrayList<>();                     // apply()메소드 실행
                for(int i = 10; i < 20 + 1; i++) {
                    nums.add(i * multNum);
                }return nums;
            });
            System.out.println(numList);

        });



    }


}
