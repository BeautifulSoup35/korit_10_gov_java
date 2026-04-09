package study.ch21.ex;


import lombok.Builder;
import lombok.Data;

import java.util.*;
import java.util.function.DoubleUnaryOperator;

class InvalidScoreException extends RuntimeException {

}

class StudentNotFoundException extends RuntimeException {

}
@Data
@Builder
class Student {
    private String name;
    private int score;

    public Student(String name, int score) throws InvalidScoreException{
        this.name = name;
        if (score <= 0 || score >= 100) {
            throw new InvalidScoreException();
        }
        this.score = score;
    }

    public void setScore(int score) throws StudentNotFoundException{
        this.score = score;
    }
}

interface GradeManager {
    void addStudent(String name, int score);
    void updateScore(String name, int score);
    Student getStudent(String name);
    void printAll();
}

class GradeManagerImpl implements GradeManager {
    private static GradeManager instance;
    Map<String, Student> studentMap;

    public GradeManagerImpl() {
        studentMap = new HashMap<>();
    }
    public static GradeManager getInstance() {
        if(instance == null) instance= new GradeManagerImpl();
        return instance;
    }

    @Override
    public void addStudent(String name, int score) throws InvalidScoreException{
//        try {
//            if (score > 100 || score < 0)
//                throw new InvalidScoreException();
//        }catch (InvalidScoreException e) {
//            System.out.println("점수 범위가 초과됐습니다.");
//        }
        studentMap.put(name, new Student(name, score));
    }

    @Override
    public void updateScore(String name, int score) throws StudentNotFoundException, InvalidScoreException{
//        Student foundStudent = getStudent(name);
//        foundStudent.setScore(score);

        getStudent(name).setScore(score);

//        Student foundStudent = studentMap.get(name);
//        if(foundStudent == null) return;
//        try {
//            foundStudent.setScore(score);
//        }catch (InvalidScoreException e) {
//            e.printStackTrace();
//        }
//
    }

    @Override
    public Student getStudent(String name) throws StudentNotFoundException{
        Student foundStudent = null;

        for(Student student : studentMap.values()) {
            if(student.getName().equals(name)) foundStudent = student;
        }
        if(foundStudent == null) throw new StudentNotFoundException();
        return foundStudent;

//        try {
//            if (!studentMap.containsKey(name))
//                throw new StudentNotFoundException();
//        }catch (StudentNotFoundException e) {
//            System.out.println("학생이 존재하지 않습니다.");
//        }
//
//        return studentMap.get(name);
    }

    @Override
    public void printAll() {
        studentMap.values().forEach(System.out :: println);
    }
}
public class Ex19 {
    public static void main(String[] args) {
        GradeManager gm = new GradeManagerImpl();
        try {
            gm.addStudent("김자바", 101);
            Student foundStudent =gm.getStudent("김자바");
            System.out.println(foundStudent);
            gm.updateScore("이없", 90);
        }catch (InvalidScoreException | StudentNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e) {

        }
        System.out.println("프로그램 종료");
        gm.addStudent("이파이", 150);   // InvalidScoreException
        gm.getStudent("없는사람");       // StudentNotFoundException
        gm.updateScore("김자바", -10); // InvalidScoreException
        gm.printAll();
    }

}
