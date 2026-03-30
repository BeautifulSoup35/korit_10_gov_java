package study.ch07;

public class Main {
    public static void main(String[] args) {

        System.out.println("프로그램 실행");
        int input1  =10;
        int input2  =5;


        //오늘의 용어 : 하드코딩

        for(int i = 0; i < input1; i++){//i는 반복횟수
            System.out.println(input1 - i);
            for(int j = 0; j < input2; j++){
                int num  = 1;
                for(int k = 0; k < j + 1 ; k++){
                    num *= 10;
                }
                System.out.println((input1 - i) * num);
// 0 0
                //1

//                if(j == 0){
//                    System.out.println((5 - i) * 10 );
//                }else if (j == 1){
//                    System.out.println((5 - i) * 100);
//                }else {
//                    System.out.println((5 - i) * 1000);
//                }
//                    num *= 10;


            }
        }
        System.out.println("프로그램 종료");

    }
}
