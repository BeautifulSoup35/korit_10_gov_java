package study.ch10.ex;

public class Ex28 {
    public static void main(String[] args) {
        int[][] nums =  {{10,20,30},{40,50,60},{70,80,90}};


        for(int i = 0; i< nums.length; i++){
            int sum = 0;
            for(int j= 0; j < nums[0].length; j++){
                sum += nums[j][i];
            }
            System.out.println(i + " 열 합계 : " + sum);
        }
    }
}
