package study.ch20.ex;

//### 문제 17. 학생 관리 시스템
//
//List와 Map을 모두 활용하는 학생 관리 시스템을 구현하시오.
//
//- `StudentManager` 클래스
//- 내부: `Map<Integer, Student>` (학번→학생)
//- `void addStudent(int id, Student s)` — 등록
//- `Student findById(int id)` — 학번으로 조회
//- `List<Student> findByMinScore(int min)` — 점수 기준 필터
//- `double getAverage()` — 전체 평균
//- `void printAll()` — 전체 출력

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
class Student {
    private int id;
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class StudentManagerImp implements StudentManager {
    private Map<Integer, Student> studentMap;

    public StudentManagerImp() {
        studentMap = new HashMap<>();
    }

    @Override
    public void addStudent(int id, Student s) {
        s.setId(id);
        studentMap.put(id, s);
    }

    @Override
    public Student findById(int id) {
        return studentMap.get(id);
    }

    @Override
    public List<Student> findByMinScore(int min) {
//        List<Student> list = new ArrayList<>();
//        for (Student s: studentMap.values()) {
//            if(min <= s.getScore()) list.add(s);
//
//        }

        return studentMap.values().stream().filter(student -> student.getScore() >= min).toList();
//        return list;
    }

    @Override
    public double getAverage() {
//        double avg = 0;
//
//        for(Student s : studentMap.values()) {
//            avg += s.getScore();
//        }
//         return avg / studentMap.size() ;

        return studentMap.values().stream().map(student -> (double) student.getScore()).reduce(0.0, Double::sum) /studentMap.size();
    }

    @Override
    public void printAll() {
//        for(Student s : studentMap.values()){
//            System.out.println(s);
//        }
        studentMap.values().forEach(System.out::println);
    }
}


interface StudentManager {
    void addStudent(int id, Student s);
    Student findById(int id);
    List<Student> findByMinScore(int min);
    double getAverage();
    void printAll();
}

public class Ex17 {
    public static void main(String[] args) {
        StudentManager sm = new StudentManagerImp();

        sm.addStudent(1, new Student( "권", 20));
        sm.addStudent(2, new Student( "민", 50));
        sm.addStudent(3, new Student( "주", 90));

        Student s = sm.findById(3);
        System.out.println(s.getId());

        sm.printAll();
    }
}
