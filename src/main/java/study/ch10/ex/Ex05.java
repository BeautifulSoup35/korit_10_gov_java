package study.ch10.ex;

public class Ex05 {
    public static void main(String[] args) {
        int[] nums = {3, 8, 15, 22, 7, 36, 41};
        int answer = 0;
        for(int num : nums){
            answer += num % 2 == 0 ? 1 : 0;
        }
        System.out.println(answer);
    }
}
