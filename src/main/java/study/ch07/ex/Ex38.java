package study.ch07.ex;

public class Ex38 {
    public static void main(String[] args) {
        int sum1 = 1;
        int sum2 = 1;
        System.out.print("1 1");
        for(int i = 0; i < 10-2; i++){

            if(i%2 ==0){
                sum1 = sum1 + sum2;
                System.out.print(" "+sum1);
            }
            else {
                sum2 = sum1 + sum2;
                System.out.print(" "+sum2);

            }
        }


    }
}
