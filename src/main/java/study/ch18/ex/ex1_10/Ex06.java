package study.ch18.ex.ex1_10;
class Config {
    static String dbUrl;

    static {
        System.out.println("1. static 블록 실행");
        dbUrl = "jdbc:mysql://localhost";
    }

    Config() {
        System.out.println("3. 생성자 실행");
    }
}

public class Ex06 {
    public static void main(String[] args) {
        System.out.println("2. main 시작");
        Config c1 = new Config();
        Config c2 = new Config();
    }
}
