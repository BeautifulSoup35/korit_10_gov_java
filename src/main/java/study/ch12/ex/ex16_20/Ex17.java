package study.ch12.ex.ex16_20;

public class Ex17 {
    public static void main(String[] args) {
        AllInOnePrinter all = new AllInOnePrinter();
        all.fax();
        all.print();
        all.fax();
    }



}

interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

interface Faxable {
    void fax();
}

class AllInOnePrinter implements Printable, Scannable, Faxable {
    @Override
    public void fax() {
        System.out.println("팩스 보내기");
    }

    @Override
    public void print() {
        System.out.println("프린트 하기");
    }

    @Override
    public void scan() {
        System.out.println("스캔하기");
    }
}