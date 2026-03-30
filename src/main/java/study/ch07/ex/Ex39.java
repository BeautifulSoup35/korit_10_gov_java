package study.ch07.ex;

public class Ex39 {
    public static void main(String[] args) {

        for(int i = 1; i < 100; i++){
            for(int j = 1; j < i; j++){
                if((i+1) % (j+1) == 0){//4 2 3
                    break;
                }

            }
//            System.out.print((i+1)+" ");
        }

    }}
