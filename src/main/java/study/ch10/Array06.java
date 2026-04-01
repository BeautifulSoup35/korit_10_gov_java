package study.ch10;

import java.util.Random;

public class Array06 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int limit = 100;

        Random random = new Random();
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(limit) + 1;//100전까지
        }
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ((i <nums.length -1) ? ", " :""));
        }
        System.out.println();

        //nums에 지정된 랜덤한 숫자중 최대값과 최솟값
        int max = 0;
        int min = limit;

        for(int i = 0; i < nums.length; i++){
            max = (max < nums[i]? nums[i] : max);
            min = (min > nums[i]? nums[i] : min);
        }
        System.out.println();
        System.out.println("최대값 : " +  max);
        System.out.println("최솟값 : " +  min);



    }
}
