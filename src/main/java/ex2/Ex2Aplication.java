package ex2;
import ex2.router.RouterPath;
import ex2.router.Routes;

public class Ex2Aplication {
    public static boolean running = true;

    public static void main(String[] args) {
        System.out.println("프로그램 실행");

        while(running) {
            Routes.valueOf(RouterPath.current).getView().render();//enum의 valueof에 있는 문자열을 가지고 그 값과 똑같이 생긴 거의 값을 가져와라
        }
        System.out.println("프로그램 종료");
    }
}
