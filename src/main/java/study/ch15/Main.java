package study.ch15;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("권민주");
        student.setAge(313);
        student.setAddress("dfjd");
        System.out.println(student);
        Student student2 = new Student("권민", 334, "부산북구");
        System.out.println(student2);

        final String data = "임시 데이터";//상수 literal 대입 오류
        System.out.println(data);

        final String data2;
        data2 = "test";
        //final(상수)는 초기화 무조건 일어나야함 초기값안들어감

        Student student3 = new Student("진혜정",34);

    }
}
