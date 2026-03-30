package study.ch07.ex;

public class Ex37 {
    public static void main(String[] args) {
        for (int i =0; i < 30; i++){
            if((i+1) % 3 ==0){
                System.out.print("Fizz");
                if((i+1) % 5 == 0){
                    System.out.print("Buzz");
                }
            }
            else System.out.print(i);
            System.out.print(" ");
        }
    }

}
