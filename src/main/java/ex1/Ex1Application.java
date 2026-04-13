package ex1;
//문제 1. 학생 성적 관리 프로그램
//설계서
//기능 요구사항:
//
//학생 등록 (이름, 국어, 영어, 수학)
//전체 학생 목록 출력 (총점, 평균 포함)
//학생 이름으로 검색
//평균 80점 이상 우등생 목록 출력
//평균 기준 내림차순 정렬 출력
//
//클래스 설계 (MVC):
//[Model]
//├── Student
//│   - String name, int kor, int eng, int math
//│   - int getTotal()
//│   - double getAverage()
//│   - toString()
//
//[Controller / Service]
//├── StudentManager
//│   - List<Student> students
//│   - void addStudent(Student s)
//│   - Student findByName(String name)
//│   - List<Student> getHonorStudents()    // 평균 80 이상
//│   - List<Student> getSortedByAverage()  // 내림차순 정렬
//│   - double getClassAverage()            // 전체 평균
//
//[View]
//├── Main
//│   - Scanner로 메뉴 출력
//│   - 1.등록 2.전체목록 3.검색 4.우등생 5.정렬 6.종료

import ex1.util.InputUtil;
import ex1.view.MainView;

import javax.net.ssl.SSLContext;
import java.io.*;
import java.util.*;

//활용 개념: 클래스, 생성자, ArrayList, for-each, Comparable/Comparator, 조건문, Scanner
public class Ex1Application {
    public static void main(String[] args) throws IOException {
        Map<String, List<Long>> resultMap = new HashMap<>();
        resultMap.put("scanner", new ArrayList<>());
        resultMap.put("custom", new ArrayList<>());
        resultMap.put("draw", new ArrayList<>());

        List<Long> b = new ArrayList<>();

        for(int i =0; i< 100; i ++){
            Scanner sc = new Scanner(new StringReader("10000000"));//scanner 객체 생성

            long t1 = System.nanoTime();

            sc.nextInt();
            if (sc.hasNextInt()) sc.nextLine();
            long t2 = System.nanoTime();

            long t3 = System.nanoTime();
            InputUtil.nextInt();
            long t4 = System.nanoTime();

            long sTime = t2 - t1;
            long cTime = t4 - t3;

            if (sTime < cTime) {
                resultMap.get("scanner").add(sTime);
            }else if (sTime > cTime){
                resultMap.get("custom").add(cTime);
            } else {
                resultMap.get("draw").add(cTime);
            }
        }
        System.out.println(resultMap);
//        int sum = b.stream().mapToInt(e -> e.intValue()).sum();
        System.out.println("custom : " + resultMap.get("custom").stream().mapToLong(a -> a).sum() / resultMap.get("custom").size());
        System.out.println("scanner : " + resultMap.get("scanner").stream().mapToLong(a -> a).sum() / resultMap.get("scanner").size());
//        System.out.println("스캐너 " + b.stream().filter(bb -> bb).count());//정규식 검사
//        System.out.println("커스텀 " + b.stream().filter(bb -> !bb).count());


        System.out.println("학생 성적 관리 프로그램 실행");
//        while (true) {
//            MainView.getInstance().run();//버튼를 누르기전 항상 버튼 속성 프린트 되도록
//            //속성은 view에서 하나의 객체만 만드는 싱글톤으로 항상 같은 객체를 가지고 온다.
//
//            System.out.print("입력 : ");//사용자 번호 입력 전 가이드로 프린트
//            //사용자의 문자를 문자열로 받겠다 -> 왜 문자열로 받을까
//            List<Integer> ints = InputUtil.nextInts();
//            int cmv = ints.get(0);
//
//
////.map(Integer :: parseInt)
////            map(str -> Integer.parseInt(str))
//            if(1 == cmv){
//
//            }else if (2 == cmv){
//
//            }else if (3 == cmv){
//
//            }else if (4 == cmv){
//
//            }else if (5 == cmv){
//
//            }else if (6 == cmv){//6일때 종료
//                break;
//            }else {
//                System.out.println("다시 입력하시오");
//            }
//
//        }
//        System.out.println("학생 성적 관리 프로그램 종료");
//
////        BufferedWriter writer = new BufferedWriter(new FileWriter("/"));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("입력 : ");
//        String a = reader.readLine();
//        System.out.println(a);
    }
}
