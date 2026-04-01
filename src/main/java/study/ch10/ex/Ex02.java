package study.ch10.ex;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = {85, 92, 78, 96, 88};
        double sum =0;
        for(int i = 0; i< nums.length; i++){
            sum += nums[i];
        }
        System.out.println("합계" + sum);
        System.out.println("평균 : " + (sum/nums.length));
    }
}
