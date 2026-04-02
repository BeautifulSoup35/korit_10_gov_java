package study.ch10.ex;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};

        for(int i =0 ; i < num.length -1 ; i++){
            for(int j =0; j < num.length -1 - i; j++){
                int temp = num[j];
                num[j] = num[j+1];
                num[j+1] = temp;
            }
        }
        System.out.println(Arrays.toString(num));

        for(int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(num));

    }
}
