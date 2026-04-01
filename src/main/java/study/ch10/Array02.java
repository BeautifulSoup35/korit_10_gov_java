package study.ch10;

public class Array02 {
    public static void main(String[] args) {
        int[] iArr = { 1, 2, 3, 4, 5 };
        char[] cArr = { 'a', 'b', 'c'};
        boolean[] bArr = {true, false, true, false};
        double[] dArr = {1.0, 3.14, 5.5};
        String[] sArr = {"권민", "민주", "주권"};

        class Student {
            private String name;
            Student(){}
            Student(String name){
                this.name = name;
            }

            public void setName(String name){
                this.name = name;
            }
        }

        Student[] students = {
                new Student(),
                new Student("민중"),
                new Student() };
        students[0].name = "권민주";//-> private에서 사용불가능
        students[3].setName("set권민주");
//
//        Student[] students2 = {new Student(), new Student(), new Student()};

    }
}
