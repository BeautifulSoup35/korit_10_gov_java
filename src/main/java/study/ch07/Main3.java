package study.ch07;

public class Main3 {
    public static void main(String[] args) {
        int num = 0;
        while (num < 10){
            System.out.println(num);
            num++;
        }


        int i = 0;
        while(i < 5) {

            int j = 0;
            while(j < 5 - 1 - i) {
                System.out.print(" ");
                j++;
            }

            j = 0;
            while(j < i + 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }


    }

}

