package study.ch10.ex;

public class Ex06 {
    public static void main(String[] args) {
        int[] nums =  {5, 12, 3, 18, 7, 21, 9, 14};
        int answer = 0;
        for(int num : nums){
            answer += num % 2 != 0 ? 1 : 0;
        }
        System.out.println(answer);
    }
}
