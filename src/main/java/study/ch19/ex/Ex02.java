package study.ch19.ex;

import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Java", "Python", "Java", "C++", "Python", "Go"));
        List<String> results = new ArrayList<>();
        for(int i =0; i< list.size(); i++) {
            String str = list.get(i);
            if(list.lastIndexOf(str) != list.indexOf(str) ) {
                list.remove(list.lastIndexOf(str));
            }

        }
        for(int i = 0; i < list.size(); i++){
            String lists = list.get(i);
            if(!results.contains(lists)){
                results.add(lists);
            }
        }




        System.out.println(list);

    }
}
