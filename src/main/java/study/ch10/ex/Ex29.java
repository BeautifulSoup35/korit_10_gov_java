package study.ch10.ex;

public class Ex29 {
    public static void main(String[] args) {
        int[][] nums = {{3,7,1},{9,2,6},{4,8,5}};

        int max = 0;
        int hang =0;
        int cl = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j =0; j < nums[i].length; j++){
                if(nums[i][j] > max){
                    max =  nums[i][j];
                    hang = i;
                    cl = j;
                }

            }

        }
//        System.out.println("최댓값: " + max + ", 위치: " +hang + ", "+ cl);
        System.out.printf("최댓값: %d , 위치 [%d][%d]", max , hang, cl);
    }
}
