package study.ch07.ex;

public class Ex20 {
    public static void main(String[] args) {
        int result = 1;
        for(int i = 0; i < 5; i++){
            result *= 5 - i;
        }

        System.out.println(result);
    }
}
