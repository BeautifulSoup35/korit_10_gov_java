package study.ch10.ex;

import java.util.Arrays;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums =  {1, 2, 3, 4, 5};
        int[] revers = new int[5];

        for(int i = 0; i< nums.length; i++){
            revers[i] = nums[nums.length - 1 - i];
        }

        System.out.println(Arrays.toString(revers));
    }
}
