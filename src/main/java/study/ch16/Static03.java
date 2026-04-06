package study.ch16;

import lombok.Getter;

@Getter
class Config {
    private static Config instance; //
    private DBConnection dbConnection;

    public void init() {
        System.out.println("설정 초기화");
        dbConnection = DBConnection.getInstance();
    }

    public static Config getInstance(){//객체 생성에 조건을 만든다.
        if(instance == null) instance = new Config();
        return instance;
    }
}

class DBConnection {
    private static DBConnection instance;//자기자신을 저장하는 객체 즉 인스턴스를 만들어라
    private DBConnection() {

    }//생성자를 private

    public void connection() {
        System.out.println("데이터 베이스 연결");
    }

    public static DBConnection getInstance(){
        if(instance == null) {
            instance = new DBConnection();//객체 생성
        }
        return instance;
    }

}

class A1 {

    private B1 b1;//생성관점이 아닌 어떤기능을 많이 쓰는지 기능관점

    public A1(B1 b1){
        this.b1 = b1;//디펜던시 인덱스 == 의존성

    }

    public void run() {
        b1.print();
        System.out.println("데이터 베이스 연결");
    }
}
class B1 {
    public void print() {
        System.out.println("B1 내용 출력");
        System.out.println("데이터 베이스 연결");
    }

}

class A2 {
    private B2 b2;

    public A2(B2 b2) {
        this.b2 = b2;
    }

    public void integrationTest() {
        b2.test(); System.out.println("데이터 베이스 연결");
    }
}

class B2 {
    public void test() {
        System.out.println("B2 테스트 실행");
        Config.getInstance().getDbConnection().connection();
        DBConnection.getInstance().connection();
        System.out.println("데이터 베이스 연결");
    }
}

public class Static03 {
    public static void main(String[] args) {
        Config.getInstance().init();//생성된 객체에서 바로 메소드 호출 가능

        B1 b1 = new B1();
        B2 b2 = new B2();
        A1 a1 = new A1(b1);
        A2 a2 = new A2(b2);

        a1.run();
        a2.integrationTest();
    }
}
