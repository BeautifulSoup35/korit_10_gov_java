package study.ch07.ex;

public class Ex24 {
    public static void main(String[] args) {
        int num = 36;
        for(int i = 0; i < num; i++){
            if(num % (i+1) != 0){
                continue;
            }
            System.out.print(i+1 + " ");
        }
    }
}
