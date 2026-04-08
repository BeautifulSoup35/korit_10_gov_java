package study.ch20.ex;
//### 문제 8. Employee 리스트 — 부서별 필터
//
//`Employee` 클래스(name, dept, salary)를 만들고 특정 부서의 직원만 필터링하시오.
//
//```java

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.*;

/// / 데이터:
/// / 김(개발팀, 4000), 이(마케팅, 3500), 박(개발팀, 4500),
/// / 최(인사팀, 3000), 정(개발팀, 3800)
/// / "개발팀" 필터 결과: [김(4000),박(4500),정(3800)]
/// / 개발팀 평균 연봉: 4100
//```
public class Ex08 {
    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>(List.of(
                Employee.builder().name("김").dept("개발팀").salary(4000).build(),
                Employee.builder().name("이").dept("마케팅").salary(3500).build(),
                Employee.builder().name("박").dept("개발팀").salary(4500).build(),
                Employee.builder().name("최").dept("인사팀").salary(3000).build(),
                Employee.builder().name("정").dept("개발팀").salary(3800).build()
        ));//직원전체

        List<Employee> devTeam = new ArrayList<>();
        List<Employee> markTeam = new ArrayList<>();
        List<Employee> persTeam = new ArrayList<>();

        for(Employee e : emps){
            if(e.getDept().equals("개발팀")){
                devTeam.add(e);

            }
            if (e.getDept().equals("마케팅")) {
                markTeam.add(e);
            }
            if (e.getDept().equals("인사팀")) {
                persTeam.add(e);
            }
        }
        System.out.println("개발팀 필터결과 :" + devTeam);
        double avg = 0;

        for(Employee e : devTeam){
            avg += e.getSalary();
        }
        System.out.println("개발팀 평균연봉 : " + avg / 3);
        System.out.println(markTeam);
        System.out.println(persTeam);

    }
}

@Data
@Builder
class Employee {
    private String name;
    private String dept;
    private int salary;
}
