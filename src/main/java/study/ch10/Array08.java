package study.ch10;

public class Array08 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};

        for (int i =0; i< nums.length; i++) {
            int num = nums[i];
            System.out.print(num + " ");
        }
        System.out.println();
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for(int i =0; i < nums.length; i++){
            nums[i] = nums[i] * 10;
        }

        int j = 0;
        for(int num : nums){
            nums[j] = num * 10;
//            nums[j] *= 100;
            j++;
        }

        for(int i =0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

        String[] names = { "권민주", "권당긴주", "권밀어진주" };
        for(int i = 0; i < names.length; i++){
            String name = names[i];
            System.out.println(name);
        }

        for(String name : names){
            System.out.println(name);
        }




    }
}
