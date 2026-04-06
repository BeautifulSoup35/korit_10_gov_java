package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;

//내부클래스) inner // 클래스의 안의 클래스 bb가 내부클래스
@AllArgsConstructor
class AA {

    @Getter
    @AllArgsConstructor
    static class BB {
        private String name;
    }

    @Getter
    @AllArgsConstructor
    class CC {
        private String text;
    }
}


public class Static04 {
    public static void main(String[] args) {
        AA a = new AA();
        AA.BB b =  new AA.BB("이름");
        AA.CC c = (a).new CC("문자열1");
        AA.CC c2 = a.new CC("문자열2");

        b.getName();
        c.getText();
        c2.getText();
    }
}
