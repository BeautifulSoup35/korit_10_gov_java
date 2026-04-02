package ex;

public class Ex05 {
    public static void main(String[] args) {
        ColorPrinter cp = new ColorPrinter();
        cp.print();

    }
}
class Printer {
    void print() {
        System.out.println("출력: ");
        System.out.println("흑백 출력 중...");
    }
}

class ColorPrinter extends  Printer{
    @Override
    void print() {
        super.print();
        System.out.println("컬러 변환 완료!");
    }
}