package study.ch10.entity;

public class Array09 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("권민주", 90);
        students[1] = new Student("권당주", 80);
        students[2] = new Student("권양주", 40);


        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].toString());
        }

        for(Student student : students){
            int score = student.getScore();
            student.setScore(score - 5);
        }

        for(Student student : students){
            System.out.println(student.toString());
        }

        String serchName = "권주";
        Student foundStudent = null;
        for (int i = 0; i < students.length; i++){
            if(serchName.equals(students[i].getName())){
                foundStudent = students[i];
            }
        }
        if(foundStudent == null){
            System.out.println("해당 이름의 학생이 존재하지 않습니다.");
            return;
        }
        System.out.println("[ 찾은 학생 정보 ]");
        System.out.println("이름 :" + foundStudent.getName());
        System.out.println("점수 :" + foundStudent.getScore());


    }
}
