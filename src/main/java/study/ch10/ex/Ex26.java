package study.ch10.ex;

public class Ex26 {

    public static void main(String[] args) {
        int[][] nums = new int[3][3];

        for(int i =0; i< nums.length; i++){
            for(int j = 0; j< nums[1].length; j++){
                nums[i][j] = (j+1) + 3 * (i);
            }
        }
        for(int i =0; i< nums.length; i++){
            for(int j = 0; j< nums[1].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

    }
}
