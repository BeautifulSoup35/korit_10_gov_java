package study.ch05;

public class Main {

    public static void main(String[] args) {
        int num  = 9;
        //num의 값이 짝수면 num에 10일 곱하고 짝수가 아ㅣㄴ면 20일 곱하여 결과를 출력

        boolean result = (num % 2 == 0);
//        if (result) System.out.println(num * 10);
//        if(!result) System.out.println(num * 20);

        if (result) {
            System.out.println((num * 10) + "\n짝수");
        } else {
            System.out.println(num * 20);
            System.out.println("홀수");
        }


        int num2 = 12;
        if (num2 % 8 == 0){
            System.out.println("8의 배수 입니다.");
        } else if(num2 % 7 == 0){
              System.out.println("7의배수입니다.");
        } else if(num2 % 6 ==0){
            System.out.println("6의배수입니다.");
        } else {
              System.out.println("8,7,6의 배수가 아닙니다.");
          }

        //제어문



        int hight = 140;
        int age = 7;

        if (age >= 7 && hight >= 140){
                System.out.println("탑승 가능");
        } else {
            if (age < 7){
                System.out.println("나이는7세이상");
            } else {
                System.out.println("키는 140cm 이상이여야한다");
            }
            System.out.println("탑승 불가능");
        }



    }
}
