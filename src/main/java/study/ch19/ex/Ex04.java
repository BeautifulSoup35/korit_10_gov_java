package study.ch19.ex;

import java.util.*;

public class Ex04 {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>(List.of(5, 2, 8));
        List<Integer> listB = new ArrayList<>(List.of(3, 9, 1));

        List<Integer> listC = new ArrayList<>();
        listC.addAll(listA);
        listC.addAll(listB);
        System.out.println(listC);

        int len = listC.size() - 1;
        for (int i = 0; i < len; i++) {
            for(int j = 0; j < len - i; j++){
                int first = listC.get(j);
                int next = listC.get(j + 1);
                if( first > next) {
                    int temp = first;
                    listC.remove(j);//해당 값지우기
                    listC.add(j , next);//그 인덱스값
                    listC.remove(j+1);//그 다음값
                    listC.add(j + 1, temp);
                }

            }
        }
        System.out.println(listC);


    }
}
