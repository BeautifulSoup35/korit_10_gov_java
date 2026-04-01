package study.ch10.ex;

public class Ex04 {
    public static void main(String[] args) {
        int[] nums = {44, 11, 77, 33, 55};
        int min = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
             if(i == 0) min = nums[0];
             else if(min > nums[i]) {
                 min = nums[i];
                 index = i;
             }

        }
        System.out.println("최솟값 : "+min+", 위치 : "+index);

    }
}
