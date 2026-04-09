package study.ch22;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
class Student {
    private int studentCode;
    private String name;
    private int score;
}

public class Stream03 {
    public static void main(String[] args) {
        Map<String, Object> studentMap = Map.of(
                "studentCode", 20260001,
                "name", "궤도",
                "score", 70
        );
        Map<String, Object> studentMap2 = Map.of(
                "studentCode", 20260002,
                "name", "권주",
                "score", 80
        );
        Map<String, Object> studentMap3 = Map.of(
                "studentCode", 20260003,
                "name", "권고",
                "score", 90
        );
        List<Map<String, Object>> studentMapList = List.of(
                studentMap,
                studentMap2,
                studentMap3
        );
        Student student = new Student();
//        List<Student> studentList = studentMapList.stream().map(m -> {
//            student.setStudentCode((int) m.get("studentCode"));
//            student.setName((String) m.get("name"));
//            student.setScore((int) m.get("score"));
//            return student;
//        });
    }

}
