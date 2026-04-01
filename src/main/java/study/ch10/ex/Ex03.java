package study.ch10.ex;

public class Ex03 {
    public static void main(String[] args) {
        int[] num = {34, 78, 12, 56, 91, 23};
        int max = 0;
        for(int i =0; i < num.length; i++){
            max = max < num[i]? num[i]:max;
        }
        System.out.println("최댓값 : " + max);
    }
}
