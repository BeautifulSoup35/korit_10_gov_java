package study.ch07;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int searchNumber = 6;
        int foundIndex = -1;

        for(int i = 0; i < 10; i++){
            int num = i + 1;
            if (num == searchNumber) {
                foundIndex = i;
                break;
            }
        }

        System.out.println("검색 번호: " + searchNumber);
        System.out.println("찾은 인덱스 번호: " + foundIndex);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("프로그램을 종료하려면 close 입력하시요 계속사용하시려면 아무키나 입력 : ");
            if(sc.nextLine().equals("close")){
                break;
            }
            System.out.println("프로그램 실행 중...");

        }



    }
}
