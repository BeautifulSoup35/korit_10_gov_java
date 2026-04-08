package study.ch20.ex;

import lombok.Builder;
import lombok.Data;

import java.util.*;
//Employee 리스트를 부서별로 그룹핑하여 Map<String, List<Employee>>를 만드시오.
//
//```java

/// / 데이터: 김(개발), 이(마케팅), 박(개발), 최(인사), 정(마케팅)
/// / 결과:
/// / 개발: [김,박]
/// / 마케팅: [이,정]
/// / 인사: [최]
//```
public class Ex14 {
    public static void main(String[] args) {
        Map<String, List<Employee2>> map = new HashMap<>(Map.of(
                "개발팀" , new ArrayList<>(),
                "마케팅" , new ArrayList<>(),
                "인사팀" , new ArrayList<>()
        ));

        List<Employee2> emps = new ArrayList<>(List.of(
                Employee2.builder().name("김").dept("개발팀").salary(4000).build(),
                Employee2.builder().name("이").dept("마케팅").salary(3500).build(),
                Employee2.builder().name("박").dept("개발팀").salary(4500).build(),
                Employee2.builder().name("최").dept("인사팀").salary(3000).build(),
                Employee2.builder().name("정").dept("개발팀").salary(3800).build()
        ));



        for(Employee2 e : emps) {
            if(e.getDept().equals("개발팀")){
               map.get(e.getDept()).add(e);//add(e.getName()) key를 get하면 value가 반환된다
            }
            if (e.getDept().equals("마케팅")) {
                map.get(e.getDept()).add(e);
            }
            if (e.getDept().equals("인사팀")) {
                map.get(e.getDept()).add(e);
            }
        }
        //



    }
}

@Data
@Builder
class Employee2 {
    private String name;
    private String dept;
    private int salary;
}