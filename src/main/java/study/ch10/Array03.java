package study.ch10;

import study.ch09.Student;

public class Array03 {
    public static void main(String[] args) {
        int[] iArr = new int[3];
        int[][] iArrArr = new int[2][3];
        int[][] iArrArr2 = {
                {10, 20, 30},
                {40, 50, 60}
        };

        int[][][] inArrArr = new int[3][3][3];

        iArr[0] = 10;
        iArr[1] = 20;
        iArr[2] = 30;

        iArrArr[0][0] = 10;
        iArrArr[0][1] = 10;
        iArrArr[0][2] = 10;
        iArrArr[1][0] = 10;
        iArrArr[1][1] = 10;
        iArrArr[1][2] = 10;

        Student student = new Student();
//        student.name = "권민주";

    }
}
