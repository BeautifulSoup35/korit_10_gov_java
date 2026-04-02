package study.ch10.ex;

public class Ex32 {
    public static void main(String[] args) {
        String[] names = {"김자바", "이파이", "박씨플"};
        int[][] scores = {
                {90, 85, 78},
                {88, 95, 92},
                {76, 80, 98}
        };
        int[] sum = new int[scores.length];
        double[] avg = new double[scores.length];
        for(int i = 0; i < scores.length; i++){
            for(int j =0; j< scores[i].length; j++){
                sum[i] = scores[i][j];
            }
            avg[i] = sum[i] / scores[0].length;
        }




    }
}
