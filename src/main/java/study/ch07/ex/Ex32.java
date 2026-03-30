package study.ch07.ex;

public class Ex32 {
    public static void main(String[] args) {
        int num = 9876;
        int sum = 0;
        int ten =1;
        int i = 0;
        int j = 1000;

        while(i < 4) {
            while (j <4) {
                j--;
            }
            sum += (num - (num/ten));
            i++;
        }
        System.out.println(sum);
    }
}
