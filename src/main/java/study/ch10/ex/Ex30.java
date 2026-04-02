package study.ch10.ex;

public class Ex30 {
    public static void main(String[] args) {
        //대각선 00 1.1 2.2 3.3  //len이 4면
        //부대각선 3 6 9 12 len이 4면
//        주 대각선  0 7 14  len이 6이면
//      부대각선 5 10
        //1  2  3  4  5  6 //5 10 15
        //7  8  9  10 11 12
        //13 14 15 16 17 18

        int[][] nums = {
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                { 13, 14, 15, 16}};

        int mainCross = 0;
        int pulsCross = 0;
        for(int i =0; i< nums.length; i++){
            mainCross += nums[i][i];
            pulsCross += nums[nums.length-1-i][nums.length-1-i];
        }
        System.out.println(mainCross);
        System.out.println(pulsCross);
    }

}
