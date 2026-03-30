package study.ch07;

public class Star {
    public static void main(String[] args) {

        int count = 10;
        /**
         *  *
         *  **
         *  ***
         *
         *  *****
         *
         */
        //

//
        for(int i = 0; i < count; i++) {
            for(int j = 0; j < count-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



//        *****
//        ****
//        ***
//        **
//        *

        for(int i = 0; i < count; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = count; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = 0; i < count; i++){
            for(int j = 0; j < count - 1 - i; j++) {// 갯수 규칙 생각하기
                System.out.print(" ");
            }
            for(int j =0; j < i + 1; j++) {
                System.out.print("*");
            }
            if(i != count-1) System.out.println();
        }




    }
}
