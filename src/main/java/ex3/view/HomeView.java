package ex3.view;

import ex3.controller.Controller;
import ex3.util.Input;

public class HomeView implements View{

    public void render() {
        homeMenu();
        Controller.HomeController(Input.input());
    }

    public void homeMenu() {
        System.out.println("======<< HOME >>======");
        System.out.println("1. 계좌생성");
        System.out.println("2. 입금");
        System.out.println("3. 출금");
        System.out.println("4. 계좌조회");
        System.out.println("5. 전체내역");
        System.out.println("6. 회원전체 조회");
        System.out.println("q. 종료");
        System.out.println("======================");
        System.out.print("입력 : ");


    }

}
