package study.ch19.ex;

import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            list.add(i + 1);
        }

        List<Integer> treeList = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        for(int i =0; i < list.size(); i++) {
            int index = list.size() -1 - i;//인덱스 번호 == 19 값은 20
            if(list.get(index) % 3 != 0) {
                continue;
            }
            treeList.add(list.get(index));
        }

        for(int i =0; i< list.size(); i++){
            int num =list.get(i);
            if(num % 3 ==0) result2.add(num);
        }
        Collections.reverse(result2);
        System.out.println(result2);
    }
}
