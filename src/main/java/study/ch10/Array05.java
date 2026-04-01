package study.ch10;

import javax.management.relation.RelationSupport;

public class Array05 {
    public static void main(String[] args) {
        //구구단을 배열에 시작 단부터 끝단까지 자동으로 저장하여 출력하는 프로그램
        int danStart = 5;
        int danEnd = 9;

        int size = danEnd - danStart + 1;
        int[][] results = new int[size][9];

        for(int i = 0; i < results.length; i++){
            int dan = i + danStart;
            for(int j = 0; j < results[i].length; j++){
                results[i][j] = dan * (j+1);
            }
        }

        for(int i = 0; i < results.length; i++){
            System.out.print("[ ");
            for(int j = 0; j < results[i].length; j++){
                System.out.print(results[i][j] + " ");
            }
            System.out.println("]");
        }


    }
}
