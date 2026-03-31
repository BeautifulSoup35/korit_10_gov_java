package study.ch08;

import study.ch01.Main;

public class OBJ02 {
    public static void main(String[] args) {


        class Addition{
            int defaultNumber = 10;


            int add(int a, int b){
                System.out.println("변수 a: " + a);
                System.out.println("변수 b: " + b);
                return a + b + defaultNumber;//20번 이동
            }

            void a(){

            }
        }


        Addition add1 = new Addition();//객체 생성 add1에 주소값 대입
        int num = 1000;//1000 리터럴값 주소 대입
        int num2 = add1.add(100, 200);// -> class안에서 add로 이동 , 100 + 200 + 10

        //기능별로 코드를 나눌 때;
        //단일 책임 원칙
        System.out.println(num + num2);//1000 + 310
    }
}
