package study.ch19;

import java.util.*;


public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> numsList = new ArrayList<>();

        //값 추가
        numsList.add(100);

        //해당 인덱스 위치에 값 추가
        numsList.add(0,200);

        Integer n1 = numsList.get(0);//해당 인덱스로 참조
        System.out.println(n1);

        //여러가지의값
        ArrayList<Integer> numsList2 = new ArrayList<>();
        numsList2.add(2);
        numsList2.add(20);
        numsList2.add(2000);
        numsList2.add(20000);
        numsList2.add(200000);

        numsList.addAll(numsList2);
//        System.out.println(Arrays.toString(numsList));
        System.out.println(numsList);
        numsList.addAll(1, numsList2);
        System.out.println(numsList);

        boolean isFound = numsList.contains(2000);
        System.out.println(isFound == true ? "값을 찾았습니다" : "값을 찾지 못했습니다.");

        for (int i =0; i< numsList.size(); i++) {
            System.out.print(numsList.get(i));
        }
        System.out.println();
        for(Integer num : numsList){
            System.out.print(num);
        }
        System.out.println();
        List<String> strList1 = new ArrayList<>();

        strList1.add("a");
        strList1.add("b");
        strList1.add("c");
        strList1.add("d");
        strList1.add("e");
        System.out.println(strList1);

        List<String> strList2 = new LinkedList<>();
        strList2.add("a");
        strList2.add("b");
        strList2.add("c");
        strList2.add("d");

        System.out.println(strList2);

        List<String> imStrList = List.of("a", "b", "c");

        List<String> nonImStrList = new ArrayList<>();
        nonImStrList.addAll(imStrList);
        System.out.println(nonImStrList);
        List<String> nonImStrList2 = new ArrayList<>(List.of("a", "b"));//생성할때 초기값 넣음
        System.out.println(nonImStrList2);

    }
}
