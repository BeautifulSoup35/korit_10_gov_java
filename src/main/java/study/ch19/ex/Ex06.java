package study.ch19.ex;

import lombok.Builder;
import lombok.Data;

import java.util.*;

@Data
@Builder
class Student {
    private String name;
    private int studentYear;
    private int korScore;
    private int engScore;
    private int mathScore;
}
public class Ex06 {
    public static void main(String[] args) {
        int currentStudentCode = 20260000;
        List<Student> studentList = List.of(
                Student.builder().name("권").studentYear(1).korScore(80).engScore(90).mathScore(2).build(),
                Student.builder().name("민").studentYear(2).korScore(70).engScore(80).mathScore(3).build(),
                Student.builder().name("주").studentYear(1).korScore(90).engScore(80).mathScore(4).build(),
                Student.builder().name("당").studentYear(2).korScore(60).engScore(70).mathScore(5).build()
        );

        Map<Integer, List<Student>> studentMap = Map.of(
                1, new ArrayList<>(),
                2, new ArrayList<>()
        );

        for (Student st : studentList) {
            studentMap.get(st.getStudentYear()).add(st);
        }//map에서는 key값으로 value를 찾는 방식이 있다.
        // n이라는 key값을 넣어 일치하는 value 객체에 바로 add하기

        System.out.println(studentMap);

        Map<String, Double> scoreMap = new HashMap<>(Map.of(
                "korScore", 0.0,
                "engScore", 0.0,
                "mathScore", 0.0
        )) ;
        for (Student st : studentList) {
            scoreMap.put("korScore", st.getKorScore() + scoreMap.get("korScore"));
            scoreMap.put("engScore", st.getEngScore() +  scoreMap.get("engScore"));
            scoreMap.put("mathScore", st.getMathScore() + scoreMap.get("mathScore"));
        }
        scoreMap.put("korScore", scoreMap.get("korScore") / studentList.size());
        scoreMap.put("engScore", scoreMap.get("engScore") / studentList.size());
        scoreMap.put("mathScore", scoreMap.get("mathScore") / studentList.size());

        for(Student st : studentList) {
            scoreMap.replace("korScore", st.getKorScore() + scoreMap.get("korScore"));
            scoreMap.replace("engScore", st.getEngScore() +  scoreMap.get("engScore"));
            scoreMap.replace("mathScore", st.getMathScore() + scoreMap.get("mathScore"));
        }
        for (String key : scoreMap.keySet()) {
            scoreMap.replace(key, scoreMap.get(key) / studentList.size());
        }


        System.out.println(scoreMap);
        Map<String, Integer> totalScoreMap = new HashMap<>();

        for(Student st : studentList) {
            totalScoreMap.put(st.getName(), st.getKorScore() + st.getMathScore() + st.getEngScore());
        }
        System.out.println(totalScoreMap);


    }



}
