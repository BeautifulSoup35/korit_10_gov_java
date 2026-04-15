package exectly;

import exectly.router.RouterPath;
import exectly.router.Routes;

public class Ex2Application {
    public static boolean running = true;

    public static void main(String[] args) {
        System.out.println("프로그램 실행");
        while (running) {
            Routes.valueOf(RouterPath.current).getView().render();
        }
        System.out.println("프로그램 종료");
    }
}
