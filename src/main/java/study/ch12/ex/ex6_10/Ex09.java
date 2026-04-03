package study.ch12.ex.ex6_10;

public class Ex09 {
    public static void main(String[] args) {

    }
}

class Calculator {
    int result;

    void add(int n) {
        System.out.println("과학 계산기 덧셈");
    }
    void sub(int n) {
        System.out.println("빼기");
    }
    void printResult() {

    }


}

class ScientificCalculator extends Calculator {

    @Override
    void add(int n) {
        super.add(n);
    }
}