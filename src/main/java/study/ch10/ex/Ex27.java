package study.ch10.ex;

public class Ex27 {

    public static void main(String[] args) {
        int[][] nums =  {{10,20,30},{40,50,60},{70,80,90}};

        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j= 0; j < nums[0].length; j++){
                sum += nums[i][j];
            }
            System.out.println(i + " 행 합계 : " + sum);
        }
    }

}
