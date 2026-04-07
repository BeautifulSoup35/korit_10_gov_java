package study.ch19.ex;

import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(85, 92, 78, 96, 88));
        System.out.println("전체 점수: " + list);
        double avg = 0;
        int max = 0;
        for (Integer a : list) {
            max = max < a? a : max;
            avg += a;
        }
        avg /= list.size();
        System.out.println("평균: " + avg );
        System.out.println("최고 점수: " + max);
    }
}
