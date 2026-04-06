package study.ch12.ex.ex6_10;

public class Ex09 {
    public static void main(String[] args) {
        ScientificCalculator sc = new ScientificCalculator();
        sc.add(10);
        sc.add(5);
        sc.sub(3);
        sc.printResult();
    }
}

class Calculator {
    int result;

    void add(int n) {
        result += n;
    }
    void sub(int n) {
        result -= n;
    }
    void printResult() {
        System.out.println(result);
    }


}

class ScientificCalculator extends Calculator {

    @Override
    void add(int n) {
        System.out.println("과학 계산기 덧셈");
    }

}
