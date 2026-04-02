package study.ch10.ex;

public class Ex31 {
    public static void main(String[] args) {
        int[][] nums = {{ 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 }};

        int[][] change = new int[3][3];

        for(int i =0; i< nums.length; i++){
            for(int j =0; j < nums[0].length; j++){
                change[j][i] = nums[i][j];
            }
        }

        for(int i =0; i< nums.length; i++){
            for(int j =0; j < nums[0].length; j++){
                System.out.print(change[i][j] + " ");
            }
            System.out.println();
        }


    }
}
