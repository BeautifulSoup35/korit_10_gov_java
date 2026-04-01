package study.ch10;

import java.util.Arrays;

public class Array07 {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 4, 1 };
        int[] beforeNums = nums.clone();

        // 10 5 2 4 1 // 0 1
        // 5 10 2 4 1 // 1 2
        //5 2 10 4 1 // 2 3
        //5 2 4 10 1 // 4 5
        //5 2 4 1 10 //
        //2 5 4 1
//        2 4 1 5
        //2 1 4
        //1 2
        int len = nums.length;
        int max = 0;
        int temp = 0;

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - i; j++) {
                int next = j + 1;
                if (next != len - i && nums[j] > nums[next]) { //교체 알고리즘
                    temp = nums[j];
                    nums[j] = nums[next];
                    nums[next] = temp;
                }
            }
        }
        System.out.println(Arrays.stream(nums).boxed().toList());
        System.out.println(Arrays.stream(beforeNums).boxed().toList());
    }
}
